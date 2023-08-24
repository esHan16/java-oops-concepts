package com.eshan.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T> {
    private T t;

    public Data(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        List<Data<String>> list = new LinkedList<>();
        list.add(new Data<String>("Monday"));
        list.add(new Data<String>("Tuesday"));
        list.add(new Data<String>("Wednusday"));
        list.add(new Data<String>("Thursday"));
        list.add(new Data<String>("Friday"));
        list.add(new Data<String>("Saturday"));
//        list.add(new Data(23.94));
//        list.add(new Data(74));
//        list.add(new Data('#'));
        ListIterator<Data<String>> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getT());
        }

    }
}
