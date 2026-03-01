package chapter5_6.video5AllInOne;

public class TooYoungException extends RuntimeException{
    TooYoungException(String str){
        super(str);

    }
}
class TooOldException extends RuntimeException{
    TooOldException(String str){
        super(str);

    }
}
