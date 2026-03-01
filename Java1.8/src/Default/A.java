package Default;
interface L{
    default void m1(){
        System.out.println("l method");
    }
}
interface R{
    default void m1(){
        System.out.println("R method");
    }
}
class A implements L,R{
    @Override
    public void m1() {
//        L.super.m1();
        System.out.println("A");
    }

    public static void main(String[] args) {
        R a = new A();
        a.m1();
    }
}
