package chapter5_6.video7;

public class InHancedForLoop {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        for(int i : a){
            System.out.print(i);
        }
        System.out.println();
        int [][]b = {{1,2,3,4},{5,4,3,2},{123,12},{23,12,32}};
        for(int [] c : b){
            for(int g : c){
                System.out.print(g+ "");
            }
            System.out.println();
        }
    }
}
