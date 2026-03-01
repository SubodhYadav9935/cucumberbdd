package chapter1.c1.abc.Lecture14;

public class Student {
    private int rollno;  // every object have rollno attribute because it is instance variable
    private String name;  // every object have name attribute because it is instance variable
    private String teacherName = "Kundan"; // single copy in whole class

    public int getRollno() {
        return rollno;
    }
    private String getName(){
        return name;
    }
    public Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public Student(){
        System.out.println("no argument constructor called");
    }

    public static void main(String[] args) {
        System.out.println(args[0]); // argument pass by intellij
        System.out.println(args[1]); // argument pass by intellij
        System.out.println(args[2]); // argument pass by intellij
        int y =  5; // local variable accessible in the body of the method only
        Student s1 =new Student();
        Student s2 =new Student(1,"Subodh");
        Student s3 = new Student(2,"Gaurav");
        System.out.println(y);

    }

}
