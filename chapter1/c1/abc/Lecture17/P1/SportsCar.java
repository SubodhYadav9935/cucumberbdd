package chapter1.c1.abc.Lecture17.P1;

public class SportsCar {
    protected void goFast(){
        System.out.println("Go Fast default method ");
    }
}
class Convertible extends SportsCar{
    /*
    * void goFast (){
    * System.out.println("Go Fast default method ");
    * }
    * */
    public static void main(String[] args) {
        Convertible c =  new Convertible();
        c.goFast(); //using inheritance
        SportsCar sc = new SportsCar();
        sc.goFast(); // using reference variable

    }


}
class Driver{
    public static void main(String[] args) {
        SportsCar sc =  new SportsCar();
        sc.goFast(); // using reference variable
    }
}