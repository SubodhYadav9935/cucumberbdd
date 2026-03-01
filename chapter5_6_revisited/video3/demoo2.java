package chapter5_6_revisited.video3;

public class demoo2 {
    private String name;
    public demoo2(String name) {
        this.name = name;
    }
    public String toString(){
        return this.name;
    }

    public static void main(String[] args) {
        int x[] = new int[]{1,2,3,4,5,6,7,8,9};
        for(int i=0;i<x.length;i++){ // by normal for loop
            System.out.println(x[i]);
        }
        for(int a:x){  // this is called foreach loop
            System.out.println(a);
        }
        // in this loop we can itterate over collection we can't put any type of condition on the arrays elements ;
        int [][]y = new int[][]{{1,2,3},{4,5,6},{6,7,8}};
        for(int [] c: y){ // used foreach loop on 2d array; in this loop can't print array in reverse order
            for(int b:c){
                System.out.print(b);
            }
            System.out.println();
        }
        demoo2 d[] = new demoo2[ ]{new demoo2("aman"),new demoo2("mohit"),new demoo2("suman")};
        for(demoo2 c:d){
            System.out.println(c);
        }
    }
}
