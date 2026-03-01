package chapter1.c1.abc.Lecture20.c;
enum CoffeeSize {
    BIG(8),HUGE(10),OVERWHELMING(16);
    private int ounces;
    CoffeeSize(int ounces){
        this.ounces=ounces;
    }
    public int getOunces(){
        return ounces;
    }
}
class Coffee{
    CoffeeSize size;

    public static void main(String[] args) {
        Coffee drink1 = new Coffee();
        drink1.size = CoffeeSize.BIG;
        Coffee drink2 = new Coffee();
        drink2.size = CoffeeSize.OVERWHELMING;
        System.out.println(drink1.size.getOunces());
        for(CoffeeSize size: CoffeeSize.values()){
            System.out.println( size+" "+size.getOunces());
        }
    }
}