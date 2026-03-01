package chapter5_6.video9;

public class StringP {
    public static void main(String[] args) {
        String s = "milan";
        s.concat("Preet");
        System.out.println(s); // this is called immutabilty

          StringBuffer a = new StringBuffer("Milan");
          a.append("preeet");
          System.out.println(a);
        String w = new String("Milan");
        String w1 = new String("Milan");
        System.out.println(w==w1);
        System.out.println(w.equals(w1));
        StringBuffer f1 = new StringBuffer("Milan");
        StringBuffer f = new StringBuffer("Milan");
        System.out.println(f1==f);
        System.out.println(f1.equals(f));

    }
}
