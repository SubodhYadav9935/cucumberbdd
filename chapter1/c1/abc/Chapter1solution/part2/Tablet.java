package chapter1.c1.abc.Chapter1solution.part2;

interface Gadget {
    void doStuff();
}
abstract class Electronic {
    void getPower() { System.out.print("plug in "); }
}
public  class Tablet extends Electronic implements Gadget {
    public void doStuff() { System.out.print("show book "); }  // if we will write public then it compile and execute fine
    public static void main(String[] args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }
}
