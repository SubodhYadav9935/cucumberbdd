package chapter5_6.video7;

public class A1 {
    A1(){
        print();
    }
    void print(){
        System.out.println("A");
    }
}
class B extends A1{
    int i = 4;

    public static void main(String[] args) {
        A1 a = new B();
        a.print();
    }
    void print(){
        System.out.println(i);
    }

}
