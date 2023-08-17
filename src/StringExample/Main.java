package StringExample;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;
    double price;
    String genre;

    Book(String title, String author, double price, String genre) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }
}

class User {
    int userId;
    String membershipType;

    User(int userId, String membershipType) {
        this.userId = userId;
        this.membershipType = membershipType;
    }
}

class BookStore {
    List<Book> availableBooks;
    List<Book> purchasedBooks;

    BookStore(List<Book> availableBooks) {
        this.availableBooks = availableBooks;
        this.purchasedBooks = new ArrayList<>();
    }

    void purchaseBooks(User user, String genre) {
        List<Book> booksToPurchase = new ArrayList<>();
        for (Book book : availableBooks) {
            if (book.genre.equals(genre)) {
                booksToPurchase.add(book);
            }
        }

        double totalCost = 0;
        for (Book book : booksToPurchase) {
            double discountedPrice = applyDiscount(user, book.price);
            totalCost += discountedPrice;
            purchasedBooks.add(book);
        }

        // Deduct totalCost from user's account (not implemented in this example)
    }

    List<Book> getPurchasedBooks(int userId) {
        List<Book> userPurchasedBooks = new ArrayList<>();
        for (Book book : purchasedBooks) {
            userPurchasedBooks.add(book);
        }
        return userPurchasedBooks;
    }

    int getTotalBooksLeftByGenre(String genre) {
        int count = 0;
        for (Book book : availableBooks) {
            if (book.genre.equals(genre)) {
                count++;
            }
        }
        return count;
    }

    double applyDiscount(User user, double price) {
        double discountedPrice = price;

        if (user.membershipType.equals("Basic")) {
            discountedPrice -= 0.1 * price;
        } else if (user.membershipType.equals("Premium")) {
            discountedPrice -= 0.2 * price;
        } else if (user.membershipType.equals("VIP")) {
            discountedPrice -= 0.3 * price;
        }

        return discountedPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "Author1", 20.0, "Fiction"));
        books.add(new Book("Book2", "Author2", 25.0, "Mystery"));
        books.add(new Book("Book3", "Author3", 30.0, "Science Fiction"));

        BookStore bookStore = new BookStore(books);
        for(Book book: books)
        {
            System.out.println(book.author);
        }

        User user = new User(1, "Premium");

        bookStore.purchaseBooks(user, "Science Fiction");

        List<Book> purchasedBooks = bookStore.getPurchasedBooks(user.userId);

        int booksLeft = bookStore.getTotalBooksLeftByGenre("Science Fiction");

        System.out.println("Purchased Books:");
        for (Book book : purchasedBooks) {
            System.out.println(book.title);
        }

        System.out.println("Books left in store: " + booksLeft);
    }
}
