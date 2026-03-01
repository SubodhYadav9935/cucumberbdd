package youtuberevision;

public class Employee {
    // implementing here Encapsulation using private instance variable
    private int empId= 123;
    private int salary = 5070;
    private String address = "Lucknow";
    public int getSalary(){
        System.out.println("I am an java developer and my salary is 8000 ");
        return salary;

    }

    public String getAddress() {
        return address;
    }
    public void display(){
        System.out.println("hi display");
    }

    public static void main(String[] args) {

    }
}
