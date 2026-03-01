package chapter5_6.video3;

public class B {
    public static void main(String[] args) throws Throwable{
        B obj = new B();
        obj.m1();
    }
    private void m1() throws Throwable {
        throw new MyException();
//        System.out.println("hello");
    }
}
class MyException extends RuntimeException{

}
