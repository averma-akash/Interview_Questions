// Thread Synchronized Java implementation of 
// singleton design pattern
class Singleton
{
    private static Singleton obj;
 
    private Singleton() {}
 
    // Only one thread can execute this at a time
    public static synchronized Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
}
/*
Here using synchronized makes sure that only one thread at a time can execute getInstance(). 
The main disadvantage of this is method is that using synchronized every time while creating
the singleton object is expensive and may decrease the performance of your program.
However if performance of getInstance() is not critical for your
application this method provides a clean and simple solution.
*/

// Static initializer based Java implementation of
// singleton design pattern
class Singleton
{
    private static Singleton obj = new Singleton();
 
    private Singleton() {}
 
    public static Singleton getInstance()
    {
        return obj;
    }
}

/*Here we have created instance of singleton in static initializer.
JVM executes static initializer when the class is loaded and hence
this is guaranteed to be thread safe. Use this method only when your
singleton class is light and is used throughout the execution of your program.*/
