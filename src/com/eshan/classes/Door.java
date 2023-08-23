package com.eshan.classes;
class  MainClass {
    public static void main(String[] args) {
        Door door = new Door();
        door.shopStatus();
        door.getLock().setLock(false);
        door.shopStatus();
    }
}
public class Door {
    private Lock lock;
    Door(){
        this.lock = new Lock(true);
    }
    public Lock getLock() {
        return lock;
    }
    public class Lock {
        private boolean lock;
        public void setLock(boolean lock) {
            this.lock = lock;
        }
        public boolean isLock() {
            return lock;
        }
        public Lock(boolean lock) {
            this.lock = lock;
        }
    }
    void shopStatus(){
        if(this.lock.isLock()){
            System.out.println("Shop is closed");
        } else {
            System.out.println("Shop is open");
        }
    }
}
