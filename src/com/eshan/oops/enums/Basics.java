package com.eshan.oops.enums;

public class Basics {
    /**
     * Enums cannot extend any classes but can implement as many interfaces as possible.
     */
    public enum Weeks implements A {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday;

        Weeks() {
            System.out.println("Enum called for "+this);
        }

        @Override
        public void hello() {
            System.out.println("Hi, How are you?");
        }
        // This is not public or protected , Hence private or default.
        // Because, If we made it public then it will allow initialization of more than one objects
        // Internally : public static final Monday = new Week(); When the constructor is called.
    }

    public static void main(String[] args) {
        Weeks weeks = Weeks.Friday;
//        System.out.println(weeks);

//        for(Weeks week: Weeks.values()){
//            System.out.println(week);
//        }

//        System.out.println(weeks.ordinal());
        weeks.hello();
        System.out.println(weeks.valueOf("Monday"));
    }
}

interface A {
    void hello();
}