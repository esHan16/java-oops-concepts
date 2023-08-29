package com.eshan.multithreading;

class CurlyBrackets {
    private Object lock = "lock";
    synchronized public void generate(){
        /**
         * If we check this method to generate properly, the whole sort of logic which is inside this method generate
         * is generating this bracket sequence and the whole insert processing is taking place inside this method.
         * This is the reason why making use of synchronized method approach is good in this scenario, because
         * there is nothing else in this method which we want to skip from synchronization process.
         * But there could be some scenarios where there are many more things which are that in, say, the method,
         * and we don't want to synchronize the complete method.
         *
         * Whenever you mark some element as a synchronized element, then the time required for processing
         * the data will go up. Because when we're adding synchronized keyword, that would be a monitor
         * lock which would be applied.
         * As a result, multiple thread won't be able to execute that particular element simultaneously.
         * And as the synchronized element won't be able to execute simultaneously, then definitely the time required
         * to process the data will go up.
         */

// --> We want the below for loop to be synchronized
// In order to synchronize a specific part of the method or a specific part of a class, then definitely
// we can make use of synchronized block.

        synchronized (lock) { // synchronized (this)
            // synchronized (this) means that synchronized this part of the block.
            /*
            We are making use in order to synchronize this block is that "this" object or "this" instance.
            whenever you make use of synchronized monitor lock order, intrinsic lock is applied.
            Now this lock need not be exposed to the outside world, and it is recommended to make use of a private
            object in order to apply the lock.
             */
            for(int i = 1 ; i <= 10 ; i++){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(i < 6){
                    System.out.print('{');
                } else {
                    System.out.print('}');
                }
            }
            System.out.println();
        }

        // Some other processing task, But the synchronized mechanism need not be required.
        for(int j = 0 ; j < 10 ; j++){
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class SunchronizedBlock {
    public static void main(String[] args) {
        CurlyBrackets curlyBracket = new CurlyBrackets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 1; i <= 5; i++) {
                    curlyBracket.generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Time Required inside thread 1"+(endTime-startTime));
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 1; i <= 5; i++) {
                    curlyBracket.generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Time Required inside thread 2"+(endTime-startTime));
            }
        }).start();
    }
}

/*
If your whole method needs to be synchronized, everything in the method is logical and the
logical part needs to be synchronized. Else that would be some issues then definitely mark the whole method as synchronized.
But if there is only part of the method which is need to be synchronized and our work should be done
and everything should be working properly. Then definitely you need to make use of synchronized block.
 */