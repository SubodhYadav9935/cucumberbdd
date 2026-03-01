package ProjectOfCoreJava.Core;

public class E_Book extends Book implements Borrowable {
    E_Book(String title, String author, Genre genre) {
        super(title, author, genre);
    }
    @Override
    public void borrowBook(){
        System.out.println(getTitle()+"Book has been downloaded ");

    }
    @Override
    public void returnBook(){
        System.out.println(getTitle()+"(E-Book) does not need to returned.");

    }

}
