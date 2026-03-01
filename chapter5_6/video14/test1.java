package chapter5_6.video14;

public class test1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1+s2;
        String s_ = "HelloWorld";
        System.out.println(s3==s_);
        final String s4 = "Hello";
        final String s5 = "World";
        String s6 ="HelloWorld";
        String s7 = s4+s5;
        System.out.println(s6==s7);
        System.out.println(s3==s7);
        String s8 ="HELLO";
        String s9 = s8.toUpperCase();
        System.out.println(s8==s9);
        String s = new String("winter");
        String s10 = "winter";
        System.out.println(s10.intern()==s10);




    }
}
