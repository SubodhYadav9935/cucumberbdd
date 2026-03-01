package chapter1.c1.abc.Lecture23.b;

interface Machine {
    void start();
    void stop();
}
class WashingMachine implements Machine{
    @Override
    public void start(){
        System.out.println("washing machine has started");

    }
    @Override
    public void stop() {
        System.out.println("washing machine has stopped");
    }
    public void dry(){
        System.out.println("drying                                   clothes");
    }

}
class Grinder implements Machine{
    @Override
    public void start() {
        System.out.println("Grinder has started grinding");
    }
    public void stop(){
        System.out.println("grinder Machine stops Grinding ");
    }
}
class TestInterface{
    public static void main(String arg[]){
        TestInterface T = new TestInterface();
        Machine m = T.getMachine();
       //WashingMachine v = T.getMachine();
        m.start();
        m.stop();
        T.Demo(new WashingMachine());
    }

    private void demo(WashingMachine washingMachine) {

    }
    public void Demo(Machine m){
        m.stop();
        m.start();

    }
    private Machine getMachine() {
        return new WashingMachine();
    }
}