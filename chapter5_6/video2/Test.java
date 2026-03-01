package chapter5_6.video2;

public class Test {
    public static void main(String[] args) {
        m1();
    }
    static void m1(){
        m2();
    }
    static void m2(){
        try{
            System.out.println(10/0);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
