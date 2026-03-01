package chapter5_6.video5AllInOne;

public class Registry {
    public static void handleException(Throwable e){
        if(e instanceof TooYoungException){
            System.out.println(e.getMessage());
        }
        if(e instanceof TooOldException){
            System.out.println(e.getMessage());
        }
        if(e instanceof Throwable){
            System.out.println("Some unknown error has occurred");
        }
    }
}
