package Predicates;

import java.util.function.Predicate;

public class A {
    public static void main(String[] args) {
        /*Predicate<String> p = (String s)->{
            if(s.length() > 5){
                return true;
            }
            else {
                return false;
            }
        };*/
        Predicate<String> p = s -> s.length() >5;
        System.out.println(p.test("milan"));
        System.out.println(p.test("Subodh"));

    }
}
