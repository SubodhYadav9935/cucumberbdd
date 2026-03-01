package chapter5_6.video3;
interface Managerial{

}

public class person implements Managerial {

}
class Test{
    public static void main(String[] args) {
        person p = new person();
        if(p instanceof Managerial){
            System.out.println("can excess employee salary");
        }else {
            System.out.println("get lost");
        }
    }
}
