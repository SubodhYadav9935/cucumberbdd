package chapter5_6.video6;

public class Mystery {
    public static void main(String[] args) {
        for(int i =0; true | false ; i++){
            if(--i ==0 || i==2){
                System.out.println("yes" + " " + i);
                break;

            } else if (i++ %2 == 0){
                System.out.println("no" +" " + i);
                
            }
        }
    }
}
