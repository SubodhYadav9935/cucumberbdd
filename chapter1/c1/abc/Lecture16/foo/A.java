package chapter1.c1.abc.Lecture16.foo;

public class A {
    int a = 5;
    protected int b = 7;
    private int c = 10;

}
class B extends A{
    public static void main(String[] args) {
        A a = new A(); // exessing by reference variable
        System.out.println(a.a); // an is default variable in the parent class that's why we can excess it ,
        //package label excess in this we can excess by R
        System.out.println(a.b);  // an is protected variable in the parent class that's why we can access it ,
        // package label excess in this we can excess by R
        // System.out.println(a.c); // private variables and methods are excessed in same class
        B b = new B();// excess by inheritance
        System.out.println(b.a); // package label excess in this we can excess by I
        System.out.println(b.b); // package label excess in this we can excess by I
        // in the same package we can excess the variable and method by both I & R
    }

}
class C{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a); // by reference variable
    }
}
