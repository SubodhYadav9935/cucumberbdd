package chapter5_6_revisited.video1;

public class TestARRHell {
    public static void main(String[] args) {
        array1();
    }
    public static void array1(){
        int a[]; //declaration
        a = new int[]{1,2,3,4};//allocation
        int u[] = new int[2];

        u = new int[]{1,4};
//        a={3,4};// array initialiser not allowed here
        int []e = {3,5};
        System.out.println(e);
        int f[] = new int[2];
        System.out.println(f[0]);
        System.out.println(f[1]);
        int b[] = {4,5};
        int x[]=new int[]{1,2};
//        int x1[] = new int[2]{5,6};
        int r[] = {1,2,3};
        System.out.println(r[1]);
        System.out.println(r.length);
        int x2[][]=new int[4][2];
        System.out.println(x2[0]);
        System.out.println(x2[0][0]);
        System.out.println(x2[0][1]);
        System.out.println(x2[3]);
//        System.out.println(x2[0][2]);
        x2[0] = new int[]{2,3,6};
        x2[1] =new int[]{4,8};
        int x3[][] = new int[][]{{1,2},{3,4},{5,6}};
        System.out.println(x3[0]);
        int x4[] = new int[][]{{1,2},{3,4},{5,6}}[0];
        System.out.println(x4[0]);
        String [][]s=new String[4][2];
        System.out.println(s[0]);
        System.out.println(s[0][0]);
        String se[] = {"Subodh" ,"Amit","gaurav"};
        System.out.println(se[1]);
        int k[] = new int[2];
        k[0] =5;
        k[1] =8;
//        k[2] =9;
//        System.out.println(k[2]);

    }
}
