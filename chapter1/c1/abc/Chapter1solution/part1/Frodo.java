package chapter1.c1.abc.Chapter1solution.part1;

public class Frodo extends Hobbit {
     public static void main(String[] args) {
       int myGold = 7;
//     System.out.println(countGold(myGold, 6)); // we can't call the instance method without creating an instance
    }
}
class Hobbit {
    int countGold(int x, int y){
        return x + y;
    }
}


