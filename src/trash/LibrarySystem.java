package trash;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibrarySystem {

    private List<Book> books = new ArrayList<>();
    private List<deletedFiles> deletedRecords = new ArrayList<>();

    // Add a new book to the library
    public void addBook(String bookName, String addedBy) {
        bookName = bookName.trim().toLowerCase();  // Normalize the input book name
        books.add(new Book(bookName, addedBy));
        System.out.println("Book added: " + bookName + " By " + addedBy);  // Debugging line
        showAllBooks();  // Print all books after adding to see if it's added correctly
    }


    // Borrow a book from the library
    public void borrowBook(String userName, String bookName) {
        bookName = bookName.trim().toLowerCase();
        for (Book book : books) {
            if (book.bookName.equals(bookName)) {
                if (book.isIssued) {
                    System.out.println("Book is already issued by " + book.issuedBy);  
                } else {
                    book.isIssued = true;
                    book.issuedBy = userName;
                    book.issueDate = LocalDate.now();
                    System.out.println("Book issued successfully to " + userName);
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }
    
    
 // Updated methods with consistent string handling

    public void returnBook(String bookName) {
        bookName = bookName.trim().toLowerCase();  
        for (Book book : books) {
            if (book.bookName.equals(bookName)) {  
                if (book.isIssued) {
                    book.isIssued = false;
                    book.issuedBy = null;
                    book.issueDate = null;
                    System.out.println("Book returned successfully.");
                    return;
                } else {
                    System.out.println("Book was not issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void deleteBook(String bookName, String deletedBy) {
        bookName = bookName.trim().toLowerCase();  // Normalize input
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.bookName.equals(bookName)) {  // Direct comparison
                // Add to deleted records
                deletedRecords.add(new deletedFiles(book.bookName, deletedBy, LocalDate.now()));
                // Remove the book from library
                iterator.remove();
                System.out.println("Book deleted! Record saved in the system.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void searchBook(String bookName) {
        bookName = bookName.trim().toLowerCase();  // Normalize input
        for (Book book : books) {
            if (book.bookName.equals(bookName)) {  // Direct comparison
                if (book.isIssued) {
                    System.out.println("Book is issued to " + book.issuedBy + " on " + book.issueDate);
                } else {
                    System.out.println("Book is available in the library.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Show all books in the library
    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Show all deleted books in trash
    public void showTrash() {
        if (deletedRecords.isEmpty()) {
            System.out.println("Trash is empty.");
            return;
        }
        for (deletedFiles record : deletedRecords) {
            System.out.println(record);
        }
    }  }

    // Search for a book in the library
  
