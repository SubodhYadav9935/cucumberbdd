package chapter1.c1.abc.lecture15;

public class SportsCar {
    private void goFast(){
        System.out.println("gofast");
    }
    private void doStuff(){
        goFast();

    }
}
class Convertible extends SportsCar{
    private void doThings(){
        SportsCar sc = new SportsCar();
        //sc.goFast();
        Convertible con = new Convertible();
        //con.goFast();

    }
}

