package Predicates;

import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        String [] names = {"Anushka","Barkha","Milan","Ujjwal","Kundan","Kishore"};
        Predicate<String> p = s-> s.startsWith("k");
        for(String s: names){
            if(p.negate().test(s)){
                System.out.println(s);
            }

        }

    }
}
