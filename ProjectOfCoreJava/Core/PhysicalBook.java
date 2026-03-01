package ProjectOfCoreJava.Core;

public class PhysicalBook extends Book implements Borrowable {
    public PhysicalBook(String title ,String author ,Genre genre){
        super(title,author,genre);
    }
    @Override
    public void borrowBook() throws BookNotFoundException{
        if(!getIsBorrowed()){
            setIsBorrowed(true);
            System.out.println(getTitle()+"Book has been borrowed ");
        }else{
            throw new BookNotFoundException(getTitle()+ "is already borrowed");
        }

    }
    @Override
    public void returnBook() throws BookNotFoundException{
        if(!getIsBorrowed()){
            setIsBorrowed(true);
            System.out.println(getTitle()+" has been return .");
        }else{
            throw new BookNotFoundException(getTitle()+ "was not borrowed .");
        }

    }
}
