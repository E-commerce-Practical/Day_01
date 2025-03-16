package LibrarySystem;

public class Book {
    private String bookType;
    private String[] books;

    public Book(String bookType, String[] books) {
        this.bookType = bookType;
        this.books = books;
    }

    public String getName() {
        return bookType;
    }

    public String[] getBooks() {
        return books;
    }
}