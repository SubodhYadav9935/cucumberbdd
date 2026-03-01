package chapter5_6.video12;

import java.util.ArrayList;
import java.util.List;

public class Basics {
    String name;
    Basics (String s){
        name=s;

    }
    public static void main(String[] args) {
        List<Basics> x = new ArrayList<>();
        x.add(new Basics("lisa"));
        x.add(new Basics("John"));
        if(x.contains("john")){
            x.add(new Basics("fareen"));
        }
        System.out.println(x);
    }
}
