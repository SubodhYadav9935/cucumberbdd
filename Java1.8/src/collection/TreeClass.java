package collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeClass  {
    public static void main(String[] args) {
        TreeMap <Integer,String> t = new TreeMap<>((i1,i2)->(i1< i2)? -1:(i1>i2)? +1:0);
        t.put(100,"a");
        t.put(101,"b");
        t.put(102,"c");
        t.put(103,"d");
        t.put(104,"e");
        t.put(105,"f");
        t.put(106,"g");
        System.out.println(t);
    }
}
