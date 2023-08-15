public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Student eshan = new Student();
        System.out.println(eshan.studentName+" "+eshan.rollNo+" "+eshan.marks);

        Student ravi = new Student("Ravi",23,96.45F);
        Student sonu = new Student(ravi);
//        eshan.studentName = "Eshan Verma";
//        eshan.rollNo = 12;
//        eshan.marks = 70.43F;

//        eshan.changeName("Aman");
//        eshan.greeting();

        System.out.println(sonu.studentName+" "+sonu.rollNo+" "+sonu.marks);

        Student one = new Student();
        Student two = one;
        one.studentName = "Anuj";
        System.out.println("two.studentName value : "+two.studentName); // Output :- two.studentName value : Anuj
        /* FINAL VARIABLE */
        final int AGE = 23;
        // age = 34; ERROR: this will throw error
        final Student student = new Student("Arpit",5,66.45F);
        student.studentName = "Rajesh";
        System.out.println("Student Name : "+student.studentName); // Student Name : Rajesh
        // student = eshan; ERROR: this will throw error because we cannot reassign the student object

//        A objA = new A("Object A");
//        for(int i = 1 ; i <= 100000000; i++){
//            objA = new A("Random Name");
//        }


    }

}
class Student { // Example of class
    int rollNo; // Properties
    String studentName;
    float marks;
    void greeting() { // Method
        System.out.println("Good Morning! It's me "+studentName);
    }
    void changeName(String name){
        studentName = name;
    }
    Student() { // Default Constructor

//        this.studentName = "Eshan Verma";
//        this.rollNo = 15;
//        this.marks = 84.45F;

        /* This is how you call a constructor from another constructor */
        this("Raj",24,33.33F);

    }
    Student(String studentName, int rollNo, float marks){
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    Student(Student student){
        this.studentName = student.studentName;
        this.rollNo = student.rollNo;
        this.marks = student.marks;
    }
}

class A {
    String name;

    public A(String name) {
        this.name = name;
    }
    //When the object of this A class is about to release from the memory, this finalize() Method is called
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being destroyed");
    }
}