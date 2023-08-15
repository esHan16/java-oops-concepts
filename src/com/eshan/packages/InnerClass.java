package com.eshan.packages;

public class InnerClass {
    /**
     * If we don't put static in inner class Test then at time creating the objects of Test class then java will throw error.
     * As the test class is dependent upon InnerClass class. Hence, every instance of InnerClass will have Test Class.
     */
    static class Test { // After making Test Class static, Test Class is not dependent on the object of InnerClass class
        String name ;
        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test obj1 = new Test("Eshan");
        Test obj2 = new Test("Rishi");
        System.out.println(obj2.name); // Output : Rishi
        System.out.println(obj1.name); // Output : Eshan
    }
}
