package chapter5_6.video4;

public class Switch {
    public static void main(String[] args) {
        int x = 5;
        switch (x){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("fri");
                break;
            default:
                System.out.println("case does not exists");
                break;
        }
    }
}
