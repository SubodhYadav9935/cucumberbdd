package chapter5_6.video12;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Arr2 {
    public static void main(String[] args) {
        List<Student> li =  new ArrayList<>();
        li.add(new Student("milan"));
        li.add(new Student("ujjwal"));
        li.add(new Student("anushka"));
        li.add(new Student("milan"));
        System.out.println(li.size());
        System.out.println(li.remove(new Student("milan")));
        System.out.println(li.size());
        System.out.println(li);
        System.out.println(li.remove(new Student("milan")));
        System.out.println(li.contains(new Student("milan")));
        System.out.println(li.size());

    }
}
class Student{
    String name = null;

    Student(String str){
        this.name = str;
    }

    public String toString(){
        return this.name;
    }
    public boolean equals(Object o){
        return true;
    }

}
