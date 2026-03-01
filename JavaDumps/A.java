package JavaDumps;

public class A {
    public static void main(String[] args) {
        int []scores1 = {1,2,3,4,5,6};
        int []scores2 = {0,0,0,0,0,0};
        System.arraycopy(scores2,2,scores1,3,2);
        for (int i : scores2){
            System.out.println(i);
        }
    }
}
class XXX{
    public void m1() throws Exception{
        throw new Exception();
    }
}
class YYY extends XXX{
    @Override
    public void m1()  {

    }
}
class Test{
    public static void main(String[] args) {
        YYY x = new YYY();
        x.m1();
    }
}
