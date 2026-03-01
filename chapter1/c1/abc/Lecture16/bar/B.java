package chapter1.c1.abc.Lecture16.bar;

import chapter1.c1.abc.Lecture16.foo.A;

class B extends A{
    public static void main(String[] args) {
        A a = new A();
//        System.out.println(a.a); // we cannot excess variable of different class in diff package
//        System.out.println(a.b); // we cannot excess variable of different class in diff package
        B b = new B();
//        System.out.println(b.a); // default variable and methods are not excessible in diff package
        System.out.println(b.b);  //protected methods and variables are excessible in diff package by inheritance
//        System.out.println(a.c); // private methods are excessible in same class
    }

}
