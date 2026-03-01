package chapter5_6.video9;

public class Test {
    public static void main(String[] args) {
        Object []a = new Object[10];
        a[0] = new Object();
//        a[1] = new String["ABC"]; //CE
        a[2] = new Integer[10];
        System.out.println(a[2]);
        System.out.println(a[0]);
        System.out.println(a[1]);
        Number []n = new Number[10];
        n[0]= new Integer(2);
//        n[1]= new String("abc");
        n[2] = new Double(10.5);
        System.out.println(n[0]);
        System.out.println(n[2]);
    }
}
