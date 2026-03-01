package chapter5_6_revisited.video1;

public class TestHellArr {
    public static void main(String[] args) {
        byte [][]big = new byte[7][7];
        byte [][]b= new byte[2][1];
        byte b3 = 5;
        byte [][][][]b2 = new byte[2][3][1][2];
        b2[0][1]= b;
        b[0][0]= b3;
//        b2[1][2][0] =b;
//        b2[1][1][0]=b[0][0];
        b2[0][1] = big;

    }
}
