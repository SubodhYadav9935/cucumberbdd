package chapter5_6.video8;

public class TestClass1 {
    public static void main(String[] args) {
//        int i = 0 ;
        int i = -1;
        int [] iA = {10,20};
        iA[i] = i = 30;
        System.out.println(  iA[0] + "   --" + iA [1]+ " ---" + i);
    }
}
class TwoDim{

    public static void main(String[] args) {
        int [][]x = new int[3][4];
        x[0][0] =23;
        x[0][1] =24;
        x[0][2] =24;
        x[0][3] =12;
        x[1][0] =22;
        x[1][1] =21;
        x[1][2] =23;
        System.out.println(x[1][0]);

    }
}
