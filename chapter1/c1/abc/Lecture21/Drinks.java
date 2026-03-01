package chapter1.c1.abc.Lecture21;

public enum Drinks {
    SHAKE(50),RUM(10),COFFEE;
    private int price;

    public int getPrice() {
        return price;
    }
    Drinks(){
        this.price = 100;
    }
    Drinks(int price){
        this.price = price;
    }
}
class Test1{
    public static void main(String[] args) {
        Drinks D[] = Drinks.values();
        for(Drinks d1: D){
            System.out.println(d1.getPrice());
        }

    }
}
