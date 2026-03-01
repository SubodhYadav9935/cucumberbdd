package chapter5_6_revisited.video2;

public class SwitchDemo {
    static enum BROWSER{
        FIREBOX ,SAFARI,CHROME;
    }
    enum TL{
        RED,GREEN,YELLOW;
    }
    static int x;

    public static void main(String[] args) {
        switchusingEnum("CHROME");
        switchTusingEnum();
        if(x==0){
            System.out.println("jan");
        } else if (x==1) {
            System.out.println("feb");
        }else if (x==2) {
            System.out.println("mar");
        }else if (x==3) {
            System.out.println("apr");
        }else if (x==4) {
            System.out.println("may");
        }else if (x==5) {
            System.out.println("june");
        }else if (x==6) {
            System.out.println("july");
        }else if (x==7) {
            System.out.println("aug");
        }else if (x==8) {
            System.out.println("sep");
        }else if (x==9) {
            System.out.println("oct");
        }else if (x==10) {
            System.out.println("nov");
        }else if (x==11) {
            System.out.println("dec");
        }else {
            System.out.println("invalid months entry");
        }
    }
    private static void switchusingEnum(String browsername){
        switch (BROWSER.valueOf(browsername)){
            case CHROME :
                System.out.println("I am using chrome");
            case FIREBOX:
                System.out.println("I am using firefox");
            case SAFARI:
                System.out.println("I am using safari ");
        }
    }
    private static void switchTusingEnum(){
        TL x = TL.YELLOW;
        switch (x){
            case RED :
                System.out.println("You need to stop");
                break;
            case GREEN:
                System.out.println("You can go now");
                break;
            case YELLOW:
                System.out.println("you need to be alert ");
                break;
        }
    }
}
