package chapter1.c1.abc.Chapter1solution.part1;

public class Electronic implements Device{
     public void doIt() {
        // ds
     }
}
abstract class Phone1 extends Electronic { }
abstract class Phone2 extends Electronic{
     public void doIt(int x) {
     }
}
class Phone3 extends Electronic implements Device {
      public void doStuff() { }
}
interface Device {
     public void doIt();
}
