package ProjectOfCoreJava.Core;

interface Borrowable {
    void borrowBook() throws BookNotFoundException;
    void returnBook() throws BookNotFoundException;
}



