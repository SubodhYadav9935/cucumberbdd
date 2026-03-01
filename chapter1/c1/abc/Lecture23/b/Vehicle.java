package chapter1.c1.abc.Lecture23.b;

public class Vehicle {

}
class Car extends Vehicle{

}
class Test1{
    public static void main(String[] args) {
        Test1 t =  new Test1();
        Car c = (Car)t.getVehicle(); // (car) called type casting
    }

    private Vehicle getVehicle() {
        return new Car();
    }

}
