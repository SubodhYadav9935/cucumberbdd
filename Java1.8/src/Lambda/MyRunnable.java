package Lambda;

class MyRunnable  implements Runnable{
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println("child thread");
        }

    }
}
class TEst{
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread th = new Thread(r);
        th.start();
        for(int i=0; i<10;i++){
            System.out.println("Main Thread");
        }

    }
}
