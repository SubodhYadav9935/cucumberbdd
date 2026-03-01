package chapter1.c1.abc.Chapter1solution.part1;

public class TestDays {
     public enum Days { MON, TUE, WED };
     public static void main(String[] args) {
          for(Days d : Days.values() );

          Days [] d2 = Days.values();
          System.out.println(d2[2]);
     }
}
