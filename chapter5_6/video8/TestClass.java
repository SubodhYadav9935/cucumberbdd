package chapter5_6.video8;

 class This {
     void m1(){
         System.out.println(this);
     }

}
class ThisDemo extends This
{
    public static void main(String[] args) {
        new This().m1();
    }
}