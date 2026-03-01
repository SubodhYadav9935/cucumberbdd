package collection;

interface Intrf{
    void m1();
}
class Test{
    int x=888;
    public void m2(){

        Intrf i = new Intrf(){
            int x = 999;
            @Override
            public void m1() {
                System.out.println(this.x);
                System.out.println(Test.this.x);

            }
        };
        i.m1();

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m2();
    }
}
