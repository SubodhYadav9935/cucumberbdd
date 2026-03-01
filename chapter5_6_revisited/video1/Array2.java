package chapter5_6_revisited.video1;

import chapter5_6.video14.S;

public class Array2 {
    public static void main(String[] args) {

        array2();
        array4();
        array3();

    }

    private static void array4() {
        int x [] = new int[]{};
//        int x1 [] = new int[0]{};
//        new int[2];
        int []x2 =new int[][]{{1}}[0];
//        int [][]x3 = new int[]{0}[0][0];
//        int d = new int[2]{}[];
        int []y ={};
     }

    public static void array2(){
        String s[] = new String[][]{{null},new String[]{"amn","sada","sdas"},{new String()}}[0];
        String s1[] =null;
        String s2[] = {null};
//        System.out.println(s1[0]);
        System.out.println(s2[0]);
        System.out.println(s[0]);
    }
    public static void array3(){
        String chs[][] = new String[5][2];
        chs[0]= new String[2];
        chs[1]= new String[5];
        int i = 97;
        for(int a=0;a< chs.length;a++){
            for(int b=0;b<chs.length;b++){
                chs[a][b]=""+i;
                i++;
            }
        }
        for(String s[] : chs){
            for(String s1:s){
                System.out.println(s1);
            }
            System.out.println();
        }
    }
}
