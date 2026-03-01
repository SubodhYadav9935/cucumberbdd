package chapter1.c1.abc.lecture15;

public class Student {
    private int rollno;
    private String name;
    private int marks;
    private static String subject;

    public static String getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public int getRollno() {
        return rollno;
    }
    public Student(int marks,String name,int rollno){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;

    }

    public static void main(String[] args) {
        Student.getSubject();
        Student s1 = new Student(45,"Gaurav",12);
        System.out.println(s1.getName()+" Score = "+s1.getMarks());
        Student s2 = new Student(55,"Abhishek",13);
        System.out.println(s2.getName()+" Score = "+s2.getMarks());
        Student s3 = new Student(55,"Subodh",14);
        System.out.println(s3.getName()+" Score = "+s3.getMarks());
    }
}
