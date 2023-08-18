package com.eshan.oops.generics.compare;

public class Student /*implements Comparable<Student> */ {
    int rollNo;
    int marks;

    public Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Marks "+marks+" R.No "+rollNo+"\n";
    }

//    @Override
//    public int compareTo(Student o) {
//        /**
//         * if this.rollNo - (int) o.rollNo == 0 then this means both are equal
//         * if this.rollNo - (int) o.rollNo < 0 then o is bigger else less
//         */
//        return (int)(this.marks - o.marks);
//    }
}
