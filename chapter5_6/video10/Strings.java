package chapter5_6.video10;

public class Strings {
    // constructor
    public static void main(String[] args) {
        String s = new String("abc");
        StringBuffer s1 = new StringBuffer(s);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s.equals(s1));
        String s2 = new String(s1);
        char [] ch = {'a','e','i','o','u'};
        String s3= new String(ch);
        System.out.println(s3);
        byte b[] = {100,122,121};
        String sr = new String(b);
        System.out.println(sr);

    }
}
