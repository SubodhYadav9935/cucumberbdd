package chapter5_6.Question5;

import java.util.*;
class Fortress {
    private String name;
    private ArrayList<Integer> list;
    Fortress() {
        list = new ArrayList<Integer>();
    }
    String getName() {
        return name;
    }
    void addToList(int x) {
        list.add(x);
    }
    ArrayList getList() {
        return list;
    }
}
