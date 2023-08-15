package com.eshan.packages.staticExamples;

public class Main {
    public static void main(String[] args) {
        Human eshan = new Human(23,"Eshan",21000.0F,false);
        Human rahul = new Human(24,"Rahul",24500.0F,false);
        Human tanya = new Human(27,"Tanya",41000.0F,true);
        Human ritu = new Human(28,"Ritu",65500.0F,true);
        System.out.println("The population is : "+ Human.population);
        func();
//        System.out.println("The population is : "+ eshan.population); By convention this should not be use, still gives right output
//        greeting(); // This will throw error
        /**
         * ERROR : This will throw error because static method doesn't belong to any instance and
         * greeting() method belongs to the instance of the class So, you cannot use a non-static method inside a static method
         */
    }
    static void func(){
        // Here it is fine. As greeting() Method requires an object to be executed.
        Main mainObject = new Main();
        mainObject.greeting();
        System.out.println("static function");
    }
    void greeting(){
//        func();// Static methods can be called inside a non-static methods
        System.out.println("Good Morning!! Have a great day ahead!");
    }
}
