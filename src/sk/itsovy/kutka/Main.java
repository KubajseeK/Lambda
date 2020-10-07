package sk.itsovy.kutka;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

        Student.Activity toUpperCase = something -> something.toUpperCase();
        Student.Activity toLowerCase = something -> something.toLowerCase();
        Student.Activity checkStringLength = something -> String.valueOf(something.length());


        System.out.println("Uppercase: " + student.doSomething("Hello ",toUpperCase) );
        System.out.println("Lowercase: " + student1.doSomething("Hello" , toLowerCase));
        System.out.println("String length is " + student2.doSomething("Hello", checkStringLength));
    }
}
