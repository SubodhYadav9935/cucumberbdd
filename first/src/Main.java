//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void intrest(){
         int SI = (P*R*T)/100;
        System.out.println(SI);
    }

    public static void main(String[] args) {
        Main obj1 = new Main();
        obj1.intrest();

    }
    private int P=50;
    private int R=1000;
    private int T=2;
}