package chapter5_6.video11;

public class Dummy {
    public static void main(String[] args) {
        boolean b= true;
        StringBuffer s = new StringBuffer("Anushka");
        System.out.println(s.charAt(0));

//        System.out.println(s.charAt(s.length())); // StringIndexOutOfBoundsException
        System.out.println(s.capacity());
        s=s.append("_Sharma");
        System.out.println(s);
        System.out.println(s.capacity());
//        System.out.println(m11());


    }
    public static void m11(){
        System.out.println("Ram");
    }
}
