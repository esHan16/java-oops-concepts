package com.eshan.oops.generics.compare;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(2,65);
        Student student2 = new Student(3,78);
        Student student3 = new Student(6,32);
        Student student4 = new Student(1,45);
        Student student5 = new Student(4,98);
        Student student6 = new Student(5,56);
        Student [] list = {student1, student2, student3, student4, student5, student6 };
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks)); -----------> Lambda Expressions
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));
//        if(student1.compareTo(student4) < 0){
//            System.out.println("Rishabh has more marks");
//        } else {
//            System.out.println("Eshan has more marks");
//        }
    }
}
