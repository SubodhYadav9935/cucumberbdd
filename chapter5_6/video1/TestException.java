package chapter5_6.video1;

public class TestException {
    public static void main(String[] args) {
        System.out.println("inside main");
        m1();
    }
    static void m1(){
        System.out.println("inside m1");
        m2();
        System.out.println("after m2");
    }
    static void m2(){
        System.out.println("Inside m2");
        System.out.println(10/0);
        System.out.println("after illegal division");
    }
}
