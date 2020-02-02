package com.company.ObjectPoolPattern;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ObjectPool<T> {

    private ConcurrentLinkedDeque<T> pool;
    /*ConcurrentLinkedQueue is a thread-safe queue based on linked nodes. */

    private ScheduledExecutorService scheduledExecutorService;
    /*
   ScheduledExecutorService starts a special task in a separate thread and observes
   the minimum and maximum number of objects in the pool periodically in a specified
    time (with parameter validationInterval).
   When the number of objects is less than the minimum, missing instances will be created.
   When the number of objects is greater than the maximum, too many instances will be removed.
   This is sometimes useful for the balance of memory consuming objects in the pool.
     */

    protected abstract T createObject();


    private void initialize(final int minObjects){
        pool = new ConcurrentLinkedDeque<T>();
        for(int i = 0; i < minObjects; i++){
            pool.add(createObject());
        }
    }

    public ObjectPool(final int minObjects) {
        initialize(minObjects);
    }

    public ObjectPool(final int minObjects, final int maxObjects,final long validInterval) {

        initialize(minObjects);

        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                int size = pool.size();

                if(size < minObjects){
                    int sizeToBeAdded = minObjects + size;
                    for (int i = 0; i < sizeToBeAdded; i++) {
                        pool.add(createObject());
                    }
                } else if (size > maxObjects) {
                    int sizeToBeRemoved = size - maxObjects;
                    for (int i = 0; i < sizeToBeRemoved; i++) {
                        pool.poll();
                    }
                }
            }
            }, validInterval, validInterval, TimeUnit.SECONDS);
        }


    public T borrowObject() {
        T object;
        if ((object = pool.poll()) == null)
        {
            object = createObject();
        }
        return object;
    }
 /*

  */

    public void returnObject(T object) {
        if (object == null) {
            return;
        }
        this.pool.offer(object);
    }

    public void shutdown(){
        if (scheduledExecutorService != null){
            scheduledExecutorService.shutdown();
        }
    }


}

