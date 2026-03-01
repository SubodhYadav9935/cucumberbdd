

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

interface I3{   // this is called the functional interface because it has single abstract method
    void m1();
    default void m2(){
        System.out.println("default");
    }
    public static void  m3(){
        System.out.println("static methods");
    }

}

public class Main  {

    public static void main(String[] args) {
        I3 i = ()->{
            System.out.println("Hello");
            System.out.println("Hello");
        };
        i.m1();

    }


}
interface I4{   // this is called the functional interface because it has single abstract method
    void m1();

}
class s implements I4{
    @Override
    public void m1() {
        System.out.println("implementing ");
    }

    public static void main(String[] args) {
        I4 i = new s();
        i.m1();
    }
}
