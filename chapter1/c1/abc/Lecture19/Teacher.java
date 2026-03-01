package chapter1.c1.abc.Lecture19;

public class Teacher {

    static String department = "Physics";
    int empId;
    public static void departmentName(){
        System.out.println("Department name method ");
        System.out.println(department);
        Teacher t = new Teacher();
        t.m3();
    }
    void m3(){
        System.out.println("m3 called");
    }
    private static void address(){
        System.out.println("address method");
    }

    public static void main(String[] args) {
        System.out.println("main method of teacher class");
        System.out.println(department);
        departmentName();
    }
}
