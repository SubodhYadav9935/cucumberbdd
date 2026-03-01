package chapter1.c1.abc.Lecture16;

public class SportsCar {
    void goFast(){
        System.out.println("goFast called");
    }
    void doStuff(){
        goFast(); // Direct excess
    }
}
class Convertible extends SportsCar{
    void doThings(){
        SportsCar sc = new SportsCar();
        sc.goFast(); // using reference variable
    }
    void doMore(){
        Convertible Con = new Convertible(); // using inheritance
        Con.goFast();
    }

}
class Drive{
    void doDriveStuff(){
        SportsCar sc = new SportsCar();
        sc.goFast();  //using reference Variable
        Convertible con = new Convertible();
        con.goFast(); //using  reference Variable
    }
}


