package ProjectOfCoreJava.Core;

public class InvalidGenreException extends Exception{
    public InvalidGenreException(String message){
        super(message);
    }

}
class BookNotFoundException extends Exception{
    public BookNotFoundException(String message){
        super(message);
    }
}
