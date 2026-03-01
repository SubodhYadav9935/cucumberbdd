package chapter5_6.video3;

public class A {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setPriority(15);
        int age;
        try{
            age = Integer.parseInt("abc");
        }catch(NullPointerException e ){
            System.out.println("invalid age");
        }
    }

}
