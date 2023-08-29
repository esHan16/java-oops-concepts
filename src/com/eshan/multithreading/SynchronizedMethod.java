package com.eshan.multithreading;
class Brackets{
    /*
    As soon as we marked this method as synchronized, this method won't get executed in multiple times
     */
    synchronized public void generate(){
        for(int i = 1 ; i <= 10 ; i++){
            if(i < 6){
                System.out.print('[');
            } else {
                System.out.print(']');
            }
        }
        System.out.println();
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {
        Brackets bracket1 = new Brackets();
        Brackets bracket2 = new Brackets();
        /*
        The reason why as soon as we are making use of different objects, we are getting these kind of inconsistent results is
        When we mark a specific element as synchronized intrinsic lock, a monitor lock would be applied.
        Now this lock is specific to objects. Whenever we are making use of different objects,
        locks are on different objects there are multiple locks. As a result, the locks are nullified,
        and we won't be able to get a proper and consistent output.
        The synchronized block will apply a lock, and lock is derived by objects. As a result your synchronized block or
        synchronize method can get affected
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1 ; i <= 10 ; i++){
                    bracket1.generate();
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1 ; i <= 10 ; i++){
                    bracket2.generate();
                }
            }
        }).start();
        /*
        Output:
        [[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]][[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]]]]
        [[[[[]
        [[[[[]]]]]
        [[[[[]]]]]
        ]]]]
        [[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]]]
        [[[[[]]]]]

        Reason -
        We have two threads and inside every thread we have this for loop. So both the threads are executing this for loop.
        Now imagine that when both the threads are executing this for loop inside the for loop, you also have some small
        processing as a result. For example, thread one is printing this opening bracket character. By the time the thread
        one is printing this character, the thread two has printed some other character on the console because both of
        these threads getting executed simultaneously. As a result, we are getting different output when we are executing
        this program multiple times.

        Solution -
        The solution is to prevent this method to get executed on multiple threads simultaneously.
         */
    }
}
