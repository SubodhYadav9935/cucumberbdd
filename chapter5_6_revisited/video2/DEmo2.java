package chapter5_6_revisited.video2;

public class DEmo2 {
    public static void main(String[] args) {
        byte b= 12;
        byte c = 2;
        int x = b+1;
        if(true){
            System.out.println("I literally start sweating with if else");
        }
        if(true);
        ;;;;
//        if(true)
//            int y=10;
        if(true) {
            int y = 10;
        }
        // dangling else problem
        if(true)
            if(true)
                System.out.println("hello");
        else
                System.out.println("hi");
    }
}
