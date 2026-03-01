package chapter5_6.video10;

public class PassByValue {
    int balance = 1000;
    void modify(PassByValue n){
        n.balance+=200;
        System.out.println(balance);
    }
    public static void main(String[] args) {
       new PassByValue().modifyValue();

    }
    void modifyValue(){
        modify(this);
        System.out.println(balance);

    }
}
class person{
    int balance = 500;
}
