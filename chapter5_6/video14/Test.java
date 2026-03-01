package chapter5_6.video14;

public class Test {
    public static void main(String[] args) {
        String hello = "Hello" ,lo = "Lo";
        System.out.println(Other.hello == hello+ " ");
        System.out.println(Other.hello == hello+ " ");
        System.out.println((hello == ("Hel" + "lo")) +" ");
        System.out.println((hello == ("Hel" + lo)) +" ");
        System.out.println((hello == ("Hel" + lo).intern() +" "));


    }
}
class Other{
    static String hello ="Hello";
}
