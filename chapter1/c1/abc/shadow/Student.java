package chapter1.c1.abc.shadow;
public class Student {
    static String name = "Vinod";
    public Student(String name){
       name=name;
    }
    public static void main(String[] args) {
        Student s1 = new Student("Jyoti");
        System.out.println(s1.name);
        s1.setName("Subodh");
        System.out.println(s1.name);
    }
    private void setName(String name) {
       Student.name=name;
    }
}
