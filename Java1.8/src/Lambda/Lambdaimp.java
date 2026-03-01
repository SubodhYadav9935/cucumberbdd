package Lambda;
@FunctionalInterface
interface i2{
    void m2(int a , int b);
}

class Lambdaimp {
    public static void main(String[] args) {
        i2 i = (a,b)->{
            System.out.println("helo");
            System.out.println(a+b);
        };
        i.m2(1,3);
    }
}
