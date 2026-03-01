package chapter1.c1.abc.Lecture17;

public class A {
    public int a=5;
    private int b = 10;

}
class B extends A{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        A a = new A();
        System.out.println(a.a);
    }
}