package ProjectOfCoreJava.Core;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book > books = new ArrayList<>();
    private ArrayList<String> activityLog = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
        activityLog.add("Added Book: "+ book.getTitle()+ "(ID : " + book.getBookId());
        System.out.println("Book added successfully");
    }
    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No more books ");
        } else {
            for(Book book:books){
                book.displayBooks();
            }
        }

    }
    public void borrowBook(Integer bookId) throws BookNotFoundException{
        for(Book book:books){
            if(book.getBookId().equals(bookId)){
                ((Borrowable)book).borrowBook();
                activityLog.add("Borrowed Book-Id :" + bookId);
                return;
            }
        }
        throw new BookNotFoundException("Book with Id " + bookId +" not found");

    }
    public void returnBook(Integer bookId) throws BookNotFoundException{
        for(Book book : books){
            if(book.getBookId().equals(bookId)){
                ((Borrowable)book).returnBook();
                activityLog.add("Returned Book Id :"+ bookId);
                return;
            }
        }
        throw new BookNotFoundException("Book with Id "+ bookId + "Not found");
    }
    public void displayActivityLog(){
        if(activityLog.isEmpty()){
            System.out.println("No activity recorded");
        }else{
            System.out.println("\n library activity log :");
            for(String log: activityLog){
                System.out.println(log);
            }
        }
    }
}
