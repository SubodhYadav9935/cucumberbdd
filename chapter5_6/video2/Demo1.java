package chapter5_6.video2;

public class Demo1 extends RuntimeException {
    static void foo() throws Demo1{
        System.out.println("hello");
    }

    public static void main(String[] args) {
        foo();
    }
}
