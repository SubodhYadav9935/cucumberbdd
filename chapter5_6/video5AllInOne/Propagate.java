package chapter5_6.video5AllInOne;

public class Propagate {
    public static void main(String[] args) {
        reverse("Subodh");
    }
    static String reverse(String str){
        if(str.length() == 0){
            throw new InvalidArgumentException("Invalid argument");
        }
        String reverseStr = "";
        for(int i = str.length()-1;i>=0;i--){
            reverseStr+=str.charAt(i);
        }

        return str;
    }
}
