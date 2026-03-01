package Predicates;

import java.util.function.Predicate;



public class Test1 {
    public static void main(String[] args) {
        int [] x = {0,5,10,15,20,25,30};
        Predicate<Integer> P1= i-> i>10;
        Predicate<Integer> P2= i-> i%2==0;
        for(int i:x){
            System.out.println(P1.and(P2).test(i));
        }
        System.out.println("the nums greater than 10 are:");
        m1(P1,x);
        System.out.println("the even numbers are:");
        m1(P2,x);
        System.out.println("the nums not greater than 10 are:");
        m1(P1.negate(),x);
        System.out.println("the nums greater than 10 and even are:");
        m1(P1.and(P2),x);
        System.out.println("the nums greater than 10 or even are:");
        m1(P1.or(P2),x);




    }
    public static void m1(Predicate<Integer> p,int []x){
        for(int x1:x){
            if(p.test(x1))
                System.out.println(x1);
        }
    }
}
