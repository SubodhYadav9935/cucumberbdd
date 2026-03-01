package chapter5_6.video8;

public class This3 {
    int i = 7;
    void m1(){

        m2(5);
        System.out.println(this);
//        int x [ ]= new int[-3];
//        System.out.println(x[-1]);
        int x[] = new int[5];
        System.out.println(x);

        System.out.println(i);
    }
    private This3 m2(int i){
        i++;
        System.out.println(i);
        return this;

    }
}
class ThisDemo3{
    public static void main(String[] args) {
        This3 obj = new This3();
        obj.m1();
    }
}

