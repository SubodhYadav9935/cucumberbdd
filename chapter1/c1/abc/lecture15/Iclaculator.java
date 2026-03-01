package chapter1.c1.abc.lecture15;

public interface Iclaculator {
    double pi = 3.14;
    int add(int a,int b);
    public abstract  int sub(int a,int b);
}
class chineseCalculator implements Iclaculator{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        chineseCalculator c = new chineseCalculator();
    }

}
