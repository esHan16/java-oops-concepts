package com.eshan.generics;

class GenericClass<T> {
    private T t;

    public GenericClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
    @Override
    public String toString() {
        return "GenericClass{" +
                "t=" + t +
                '}';
    }
}
class Main {
    public static void main(String[] args) {
        GenericClass<String> genericClassObj = new GenericClass<>("Some Data");
        String str = genericClassObj.getT();
        System.out.println(str);
        System.out.println(genericClassObj);
    }
}
