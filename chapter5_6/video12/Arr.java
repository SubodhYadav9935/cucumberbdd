package chapter5_6.video12;

import java.util.ArrayList;
import java.util.List;

public class Arr {
    public static void main(String[] args) {
        List <Integer> li = new ArrayList<>();
        li.add(new Integer(1));
        li.add(new Integer(2));
        li.add(new Integer(3));
        li.add(new Integer(2));
        li.remove(2);
        System.out.println(li);
        li.remove(2);
        System.out.println(li);

    }
}
