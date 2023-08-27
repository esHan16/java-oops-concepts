package com.eshan.multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // The code will run under new thread.
//                System.out.println("We are now in thread : "+Thread.currentThread().getName());
//                System.out.println("Current thread priority : "+Thread.currentThread().getPriority());

                throw new RuntimeException("Intentional Exception"); // Throwing Runtime exception
            }
        });
        // Catching the Uncaught Exception inside the thread
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            /**
             *
             * @param t the thread
             * @param e the exception
             *
             * Normally unchecked exceptions that happen in Java, simply bring down the entire thread unless we catch
             * them explicitly and handle them in a particular way.
             * With thread.setUncaughtExceptionHandler We can set an exception handler for the entire thread at its inception.
             * That handler will be called if an exception was thrown inside the thread and did not get caught anywhere
             * in this case, we're simply going to print out the thing, the thread and
             * the exception that was not caught, but more realistically, this
             * would be a place where we could clean up some of the resources or log additional
             * data to enable us troubleshoot this issue.
             */
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Critical Error happened in thread : "+thread.getName()+" and the error is : "+e.getMessage());
            }
        });
        thread.setName("Misbehaving Thread");
//        thread.setName("Workers thread");
//        thread.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("We are in thread: "+Thread.currentThread().getName()+" before starting a new thread");
        thread.start();
//        System.out.println("We are in thread: "+Thread.currentThread().getName()+" after starting a new thread");
//        Thread.sleep(10000);
    }
}
