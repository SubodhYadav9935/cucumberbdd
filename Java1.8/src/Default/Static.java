package Default;
interface inte{
    public static void m1(){
        System.out.println("interface of static method ");
    }
}
public class Static implements inte
{
    public static void main(String[] args) {
        Static s = new Static();
        inte.m1();
    }
}
