package com.eshan.collectionFramework;

public class HashCodeExamples {
    public static void main(String[] args) {
        String str1 = new String("Eshan");
        String str2 = new String("Eshan");
        if(str2 == str1){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        System.out.println("Name1 : "+str1.hashCode());
        System.out.println("Name2 : "+str2.hashCode());

        System.out.println(str1.equals(str2));
    }
}
