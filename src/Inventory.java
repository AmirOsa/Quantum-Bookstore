import java.util.*;

public class Inventory {
	
    private HashMap<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getISBN(), book);
        System.out.println("Quantum book store: Added book with ISBN " + book.getISBN());
    }

    public Book removeBook(String ISBN) {
        return books.remove(ISBN);
    }

    public void removeOutdatedBooks(int cutoffYear) {
        Iterator<HashMap.Entry<String, Book>> iterator = books.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, Book> entry = iterator.next();
            if (entry.getValue().getYear() < cutoffYear) {
                System.out.println("Quantum book store: Removing outdated book " + entry.getKey());
                iterator.remove();
            }
        }
    }

    public double buyBook(String ISBN, int quantity, String email, String address) {
        Book book = books.get(ISBN);
        if (book == null) {
            throw new IllegalArgumentException("Quantum book store: Book not found.");
        }
        if (!book.isForSale()) {
            throw new IllegalArgumentException("Quantum book store: Book is not for sale.");
        }
        return book.buy(quantity, email, address);
    }
}
