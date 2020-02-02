**Object Pool Pattern**

Reuse objects that are difficult to create. 

Basically, an Object pool is a container which contains a specified amount of objects. When an object is taken from the pool, it is not available in the pool until it is put back. Objects in the pool have a lifecycle: creation, validation and destroy.

A pool helps to manage available resources in a better way. There are many using examples: especially in application servers there are data source pools, thread pools etc.

It is most effective in a situation where the rate of initializing a class instance is high.

It can also provide the limit for the maximum number of objects that can be created.


So in this there will be following classes:

1. ObjectPool , an abstract class where you can set the no of objects to be created, get an object from pool, return object to the pool and shut down the pool is no longer needed.

