package chapter5_6.video2;

public class Demo4 {
    static void foo(){
        throw new MyException();
//        System.out.println("hello");
    }

    public static void main(String[] args) {
        foo();
    }
}
class MyException extends RuntimeException{

}
