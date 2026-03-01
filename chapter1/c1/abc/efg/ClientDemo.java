package chapter1.c1.abc.efg;

import chapter1.c1.abc.Student;
import chapter1.c1.abc.cde.Professor;

class ClientDemo{
    public static void main(String[] args) {
        Professor p1 = new Professor("Economics",30000,"Mtech");
        System.out.println( p1.getEducationQualification());// it is accessible
        System.out.println(p1.getDepartment());// it is accessible
        //p.getSalary(); // it is not because method is private in the professor class
        Student s1 = new Student(45,"asss");
        System.out.println(s1.getMarks());// Professor is capable to see the marks of Students
        //s1.getAddress(); // from professor class professor is not able to get the Address of student
    }
}
