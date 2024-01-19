package Task__2;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Task__2.Book;
/*
Create a library catalog system that manages information about books. Implement this system using records, optionals, and streams. 
The goal is to handle scenarios where a book may or may not be available in the library. 

- Create a record named Book with fields for the book title, author, publication year, and availability status (boolean).
- Create a class named LibraryCatalog that contains a list of books.
- Add methods to the catalog to:
- Check the availability of a book by title.
- Retrieve the details of the first available book by a specific author.
- Update the availability status of a book.
- Use optionals to handle scenarios where a book may or may not be found.
- Utilize streams to filter and process the list of books in the catalog.
- Within a main method instantiate the LibraryCatalog and add several books to it.
- Test the methods to check availability, retrieve book details, and update availability. Use optionals and streams for efficient book 
retrieval and processing.
*/
record Book(String title, String author, int year, boolean isAvailable){

}
class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public Optional<Boolean> isBookAvailable(String title) {
        return books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst()
                .map(Book::isAvailable);
    }

    // Retrieve the details of the first available book by a specific author
    public Optional<Book> getFirstAvailableBookByAuthor(String author) {
        return books.stream()
                .filter(book -> book.author().equalsIgnoreCase(author) && book.isAvailable())
                .findFirst();
    }

    // Update the availability status of a book
    public boolean updateAvailability(String title, boolean newAvailability) {
        Optional<Book> bookOptional = books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst();

        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            book = new Book(book.title(), book.author(), book.year(), newAvailability);
            books.set(books.indexOf(bookOptional.get()), book);
            return true;
        }

        return false;
    }

    // Getter for the book list
    public List<Book> getBooks() {
        return books;
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Testing
        List<Book> bookList = List.of(
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951, true),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, false),
                new Book("1984", "George Orwell", 1949, true),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, true)
        );

        LibraryCatalog libraryCatalog = new LibraryCatalog(bookList);

        System.out.println("Is '1984' available? " + libraryCatalog.isBookAvailable("1984").orElse(false));

        Optional<Book> firstAvailableBookByAuthor = libraryCatalog.getFirstAvailableBookByAuthor("J.D. Salinger");
        System.out.println("First available book by J.D. Salinger: " + firstAvailableBookByAuthor.orElse(null));
        

        System.out.println("Updating availability of 'To Kill a Mockingbird' to true...");
        libraryCatalog.updateAvailability("To Kill a Mockingbird", true);

        System.out.println("Is 'To Kill a Mockingbird' available now? " +
                libraryCatalog.isBookAvailable("To Kill a Mockingbird").orElse(false));
    }
}