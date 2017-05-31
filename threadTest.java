// Thread test

// Thread can be implemented in two ways:
// 1. Using implement runnable
// 2. Using extends Thread

// Here I'm using runnable implements

/*
 Steps:
 1. public void run( ) :
    This method provides an entry point for 
    the thread and you will put your complete 
    business logic inside this method
    
2. Thread(Runnable threadObj, String threadName);
    Instantiate an Object
    
3. void start();
    After creating to start
    
*/


class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;
    
    RunnableDemo(String name) {
        threadName = name;
        System.out.println(":)
    }
}


































