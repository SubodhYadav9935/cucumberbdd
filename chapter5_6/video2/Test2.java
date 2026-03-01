package chapter5_6.video2;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        foo1();
    }

    private static void foo1() throws InterruptedException {
        foo2();
    }

    private static void foo2() throws InterruptedException {
        throw new InterruptedException();
//        Thread.sleep(1000);
//        System.out.println("I want to do both java 7 java 8 certificate but keep missing class");
    }
}
