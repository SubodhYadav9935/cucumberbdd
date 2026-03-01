package ProjectOfCoreJava.Core;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        while(true){
            System.out.println("\n Library Management System ");
            System.out.println("1. Add Physical Book");
            System.out.println("2. Add E-Book");
            System.out.println("3. Display Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book ");
            System.out.println("6. View Activity Log");
            System.out.println("7. Exit");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(sc.nextLine());
            try{
                switch (choice){
                    case 1:
                        System.out.print("enter book Title :");
                        String title = sc.nextLine();
                        System.out.print("Enter Author name :");
                        String author = sc.nextLine();
                        System.out.print("Enter Genre ");
                        Genre genre = Genre.validateGenre(sc.nextLine());
                        library.addBook(new PhysicalBook(title,author,genre));
                        break;
                    case 2:
                        System.out.print("Enter book Tile");
                        String eTitle = sc.nextLine();
                        System.out.print("Enter author name");
                        String eAuthor = sc.nextLine();
                        System.out.println("Enter Genre");
                        Genre eGenre = Genre.validateGenre(sc.nextLine());
                        library.addBook(new E_Book(eTitle,eAuthor,eGenre));
                        break;
                    case 3:
                        library.displayBooks();
                        break;
                    case 4:
                        System.out.println("Enter book Id To borrow");
                        library.returnBook(Integer.parseInt(sc.nextLine()));
                        break;
                    case 5:
                        System.out.println("Enter Book ID To borrow :");
                        library.returnBook(Integer.parseInt(sc.nextLine()));
                        break;
                    case 6:
                        library.displayActivityLog();
                        break;
                    case 7:
                        System.out.println("Exit from library");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice ! try again");
                }
            }catch (InvalidGenreException e) {
                throw new RuntimeException(e.getMessage());
            } catch (BookNotFoundException e) {
                throw new RuntimeException(e.getMessage());
            }
        }

    }
}
