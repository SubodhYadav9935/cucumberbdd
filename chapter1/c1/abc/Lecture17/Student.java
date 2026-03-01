package chapter1.c1.abc.Lecture17;

public class Student {
    int salary = 400;
    void m1(){

    }
    static String department = "HR";

    public static void main(String[] args) {
        Student s = new Student();
        s.toString(); // this is called the accessing method by virtue of inheritance


    }

    @Override
    public String toString() {
        System.out.println("this is my first overriding ");

        return null;
    }
}
