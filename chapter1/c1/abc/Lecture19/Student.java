package chapter1.c1.abc.Lecture19;

public class Student {
    private int rollno;
    private String name;
    void read(){
        System.out.println(this);
        this.play();
        System.out.println("I am reading ");
        Student s2 = new Student();
        s2.play();
    }
    void play(){
        System.out.println("I am play with java");
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        s.read();
    }
}
