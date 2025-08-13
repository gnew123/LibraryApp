package trash;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LibrarySystem library = new LibrarySystem();
        while(true) {
            System.out.println("menu \n");
            System.out.println("1. Add book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Show All Books");
            System.out.println("7. Show Trash Records");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(sc.nextLine());
            
            switch(choice) {
                case 1:
                    System.out.println("enter your name");
                    String adder = sc.nextLine();
                    System.out.println("enter book name");
                    String addBook = sc.nextLine();
                    library.addBook(addBook, adder);
                    break;
                    
                case 2:
                    System.out.println("enter your name");
                    String borrower = sc.nextLine();
                    System.out.println("Debug: borrower = '" + borrower + "'");
                    System.out.println("enter book name");
                    String bookToBorrow = sc.nextLine();
                    System.out.println("Debug: bookToBorrow = '" + bookToBorrow + "'");
                    library.borrowBook(borrower, bookToBorrow);
                    break;
                    
                case 3:
                    System.out.println("enter the book name");
                    String bookToReturn = sc.nextLine();
                    library.returnBook(bookToReturn);
                    break;
                    
                case 4:
                    System.out.print("Enter book name to search: ");
                    String searchBook = sc.nextLine();
                    library.searchBook(searchBook);
                    break;
                    
                case 5:
                    System.out.print("Enter your name: ");
                    String deleter = sc.nextLine();
                    System.out.print("Enter book name to delete: ");
                    String bookToDelete = sc.nextLine();
                    library.deleteBook(bookToDelete, deleter);
                    break;
                    
                case 6:
                    library.showAllBooks();
                    break;
                    
                case 7:
                    library.showTrash();
                    break;
                    
                case 8:
                    System.out.println("Exiting. Goodbye!");
                    return;
                    
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}