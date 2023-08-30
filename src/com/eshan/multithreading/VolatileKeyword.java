package com.eshan.multithreading;

public class VolatileKeyword {
    /*
    There could be some scenario when your thread is dependent on a variable.
    And for optimization purposes, Java caches these value of the variable.
    For example, even if using some different thread via resetting the value of flag, this flag may not read the
    updated value, and it will keep reading the old values Zero and the infinite loop will go on.
    This kind of scenario could be that definitely this is a rare scenario of a caching the value.
    So whenever that is threaded, which are dependent on some variable, it is always good to mark them as volatile.
     */
    volatile public static int flag = 0;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if(flag == 0) {
                        System.out.println("Running ");
                    } else {
                        break;
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                flag = 1;
            }
        }).start();
    }
}
