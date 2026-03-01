package chapter5_6.video14;

public class S {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println(s1+s2 =="helloworld");
        System.out.println(s1+s2 == s3);
        final String s4 = "hello";
        final String s5 = "world";
        System.out.println(s4+s5=="helloworld");
    }
}
