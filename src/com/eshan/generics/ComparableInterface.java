package com.eshan.generics;

class ComparableInterface<T extends Comparable<T>> implements Comparable<T> {
    private T object;

    public ComparableInterface(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "ComparableInterface{" +
                "object=" + object +
                '}';
    }

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    @Override
    public int compareTo(T o) {
//        return getObject().compareTo(o);
        return o.compareTo(getObject()); // for opposite result
    }
}

class CIMain {
    public static void main(String[] args) {
        ComparableInterface<Integer> comparableInterface = new ComparableInterface<>(1);
        System.out.println(comparableInterface.compareTo(3));
        System.out.println(comparableInterface.compareTo(0));
    }
}