package chapter5_6.video11;

public class Dummy2 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        String se = new String("JAva");
        s.append("Area of circle ");
        s.append(3.14);
        s.append(true);
        s.append('a'); // append method is overloaded
//        s.append(null); // ambiguous reference
        System.out.println(s.length());
//        System.out.println(s.charAt(123));
        s.setCharAt(0,'s');
        System.out.println(s);
        s.insert(0,"Aman");
        System.out.println(s);
        s.delete(0,3);
        System.out.println(s);
        s.deleteCharAt(0);
        System.out.println(s);
//        s.reverse();
        System.out.println(s);
//        s.setLength(1212);
        System.out.println(s.length());
//        s.ensureCapacity(100);
        System.out.println(s);
        s.trimToSize();
        System.out.println(s);
        System.out.println(s.length());
//        System.out.println(s.delete(-1,12)); // String index out of bounds Exception
//        System.out.println(s.delete(12,0));  // String index out of bounds Exception
        s.reverse();
        s.delete(0,323);
        System.out.println(s.delete(0,s.length()));
        System.out.println(s);
        s.append("Subodh_Yadav");
        System.out.println(s);
//        System.out.println(s.deleteCharAt(-1)); // String index out of bounds Exception
//        System.out.println(s.deleteCharAt(23)); // String index out of bounds Exception
        String s1 = new String("You can't change me!");
        String s2 = new String("You can't change me!");
        System.out.println(s1 == s2);
        String s3 = "You can't change me!";
        System.out.println(s1==s3);
        String s4 = "You can't change me!";
        System.out.println(s3==s4);
        String s5 = "You can't" +"change me!";
        System.out.println(s5==s3);
        String s6 = "You can't";
        String s7 = s6 + "change me!";
        System.out.println(s3==s7);
        final String s8 = "You can't";
        String s9 = s8 + "change me!";
        System.out.println(s3==s9);
        System.out.println(s6==s8);

    }
}
