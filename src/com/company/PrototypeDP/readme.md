Its just about adding cloning feature in the object itself. 
Suppose we have an Object that loads data from database. Now we need to modify this data in our program multiple times, so it’s not a good idea to create the Object using new keyword and load all the data again from database. 
The better approach would be to **clone the existing object into a new object and then do the data manipulation.**
