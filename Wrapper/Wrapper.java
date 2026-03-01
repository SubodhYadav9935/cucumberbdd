package Wrapper;

public class Wrapper {
    public static void main(String[] args) {
        Integer i = new Integer(122);
        System.out.println(i);
        Integer i1 = new Integer("122");
        System.out.println(i1);
        Double d = new Double(12.0);
        Double d1 = new Double("12.0");
//        Integer i2 = new Integer("ten");
//        System.out.println(i2);
        System.out.println(d);
        System.out.println(d1);
        Float f = new Float(10.5f);
        Float f1 = new Float("10.5");
        Float f2 = new Float(10.5);
        Double d2= new Double(12.0f);
        Double d3 = new Double("12.0f");
        Double d4 = new Double(12.0);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d2);
        System.out.println(f2);
        System.out.println(f1);
        System.out.println(f);
        Boolean b = new Boolean("falsE");
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("True");
//        Boolean b3 = new Boolean(Milan);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);





    }
}
