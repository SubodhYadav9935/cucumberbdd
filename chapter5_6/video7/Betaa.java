package chapter5_6.video7;

class Baap{
    public int h =4;
    public int getH(){
        System.out.println("Baap" + " "+ h);
        return h;
    }

}

public class Betaa extends Baap {
    public int h =44;
    public int getH(){
        System.out.println("Beta" + " "+ h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new Betaa();
        System.out.println(b.h +"  "+ b.getH());
        Betaa bb = (Betaa) b;
        System.out.println(bb.h +"  "+ bb.getH());

    }
}
