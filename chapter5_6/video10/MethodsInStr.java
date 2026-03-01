package chapter5_6.video10;

public class MethodsInStr {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // charAt method
        System.out.println(s.length());
        System.out.println(s.charAt(12));
//        System.out.println(s.charAt(-1));
        System.out.println(s.charAt(s.length()-1));
//        System.out.println(s.charAt(30));

        //Concat method
        String s1 = "abc";
        s1.concat("def");
        System.out.println(s1);

        // EqualsIgnorecase
        System.out.println(s1.equalsIgnoreCase("ABC"));
         // Substring
        System.out.println(s.substring(0,10));
        System.out.println(s.substring(2,2));
        // replace
        System.out.println(s1.replace('a','x'));
        String s33 = new String("java");
        String s2 = s33.toUpperCase();
        String s3 = s33.toLowerCase();
        System.out.println(s2==s3);
        String s4 = s2.toLowerCase();
        String s5 = s4.toUpperCase();

    }
}
