package chapter5_6.Question6;

public class Temp {

    public static void main(String[] args) {
        String s = "bob";
        String[] sa = {"a","bob","ann"};
        final String s2 = "bob";
        StringBuilder sb =new StringBuilder("bob");
        switch (sa[1]){
            case "ann":
                ;
            /*case s:
                ;*/
            case s2 :
                ;
        }
    }
}
