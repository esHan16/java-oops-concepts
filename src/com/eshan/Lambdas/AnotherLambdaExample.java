package com.eshan.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface LambdaExpression {
    public void printStatement();
}
class Data {
    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class AnotherLambdaExample {
    public static void main(String[] args) {
        /*
            LambdaExpression lambdaExpression =() -> {
            System.out.println("Lambda Expression");
        };
        lambdaExpression.printStatement();
         */
        List<Data> list = new ArrayList<>();
        list.add(new Data("BMW"));
        list.add(new Data("Audi"));
        list.add(new Data("Volvo"));
        list.add(new Data("Mercedes"));

//        Collections.sort(list, new Comparator<Data>() {
//            @Override
//            public int compare(Data o1, Data o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        Collections.sort(list,(Data o1, Data o2) -> {
            if(o1.getName().length() < o2.getName().length()){
                return -1;
            } else if(o1.getName().length() > o2.getName().length()) {
                return 1;
            } else {
                return 0;
            }
//            return o1.getName().compareTo(o2.getName());
        });

        list.forEach(i -> {
            System.out.println(i.getName());
        });

//        for(Data data: list){
//            System.out.println(data.getName());
//        }

    }
}
