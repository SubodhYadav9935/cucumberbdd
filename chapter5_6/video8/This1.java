package chapter5_6.video8;

public class This1 {
    int i = 5;
    void m1(){
        This1 ref = this;
        m2(this);
        System.out.println(this);
        System.out.println(i);
    }
    private This1 m2(This1 o){
        System.out.println(o);
        o.i =7;
        return this;

    }
}
class ThisDemo1{
    public static void main(String[] args) {
        This obj = new This();
        obj.m1();
    }
}
