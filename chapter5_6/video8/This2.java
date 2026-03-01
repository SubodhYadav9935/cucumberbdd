package chapter5_6.video8;

public class This2 {
    int i = 7;
    void m1(){
        This2 ref = this;
        m2(5);
        System.out.println(this);
        System.out.println(i);
    }
    private This2 m2(int i){
        i++;
        System.out.println(i);
        return this;

    }
}
class ThisDemo2{
    public static void main(String[] args) {
        This2 obj = new This2();
        obj.m1();
    }
}

