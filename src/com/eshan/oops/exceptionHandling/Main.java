package com.eshan.oops.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            int c = divide(a, b);
//            throw new RuntimeException();
            String name = "eshan";
            if(name.equals("eshan")){
                throw new MyException("Name is Eshan");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Throwing Arithmetic Exception");
        } catch (Exception e) {
            System.out.println("Throwing Exception");
        } finally {
            System.out.println("This statement will always execute");
        }
        System.out.println("Program ended");
    }
    static int divide (int a, int b) throws ArithmeticException { //Have to declare that this function may throw Arithmetic Exception using throw keyword
        if(b == 0){
            /** Explicitly throwing an error, We use throw keyword*/
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
