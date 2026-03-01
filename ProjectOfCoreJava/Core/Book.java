package ProjectOfCoreJava.Core;

abstract class Book {
    private Integer BookId;
    private String title;
    private String author;
    private Genre genre;
    private boolean IsBorrowed;
    private static Integer bookIdCounter = 1000;
    Book(String title,String author,Genre genre){
        this.bookIdCounter=bookIdCounter++;
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.IsBorrowed=false;

    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Boolean getIsBorrowed(){
        return IsBorrowed;
    }
    public void setIsBorrowed(boolean isBorrowed){
        this.IsBorrowed=isBorrowed;
    }
    public void displayBooks() {
        StringBuffer sb = new StringBuffer();
        sb.append("Book Id :").append(BookId)
                .append("Titile ,:").append(title)
                .append("Author,").append(author)
                .append("Genre ,").append(genre)
                .append("-").append(genre.getDescription())
                .append("Status :").append(IsBorrowed ? "Borrowed" : "Available");
        System.out.println(sb);
    }
    public Integer getBookId(){
        return bookIdCounter;
    }
}
