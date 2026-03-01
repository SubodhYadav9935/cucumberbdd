package chapter5_6.video1;

public class Test3 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("hello, illegal division");
        }
        System.out.println("After catch ");
    }
}
