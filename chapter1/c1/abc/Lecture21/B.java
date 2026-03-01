package chapter1.c1.abc.Lecture21;

class B {
     public static void main(String[] args) {
         B b = new B();
         b.m1();
     }
     void m1(){
         System.out.println(this.hashCode());
         System.out.println("m1");
         m3();
     }
     void m3(){
         System.out.println(this.hashCode());
         System.out.println("m3");
     }
     static void m2(){
         System.out.println(" static m2 ");
     }
}
