package chapter5_6.video7;



public class SwitchCase {
    public static void main(String[] args) {
//        boolean b = (5%2)==0? true: false;
//        boolean b = true;
//        switch (b){
//            case true:
//                System.out.println("focus is the key to success");
//                break;
//            case false:
//                System.out.println("something");
//                break;
//            default:
//                System.out.println("something went wrong ");

//        }
        l1:
        for(int i = 0;i<3;i++){
            m:
            for(int j = 0 ;j<3;j++){
                if(i==j)
                    break ;
                System.out.println(i + "" + j);


            }
        }
        System.out.println("hello");
    }
}
