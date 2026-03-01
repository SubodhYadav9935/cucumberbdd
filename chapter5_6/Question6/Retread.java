package chapter5_6.Question6;

class MyException extends Exception{}
class Tire{
    void doStuff(){

    }
}

public class Retread extends Tire{
    public static void main(String[] args) {
        new Retread().doStuff();
    }
    void doStuff() throws ArithmeticException
    {
        System.out.println(7/0);

    }

}
