package LibrarySystem;
public class LibraryApp {
    public static void main(String[] args) {

        String[] printedBook = {"Harry Potter", "The Hobbit", "The Lord of the Rings"};
        String[] ebook = {"The Da Vinci Code", "Angels and Demons", "Inferno"};
        String[] audiobook = {"The Alchemist", "The Little Prince", "The Book Thief"};

        Book book1 = new Book("Printed Book", printedBook);
        Book book2 = new Book("E-Bo5ok", ebook); 
        Book book3 = new Book("Audio Book", audiobook);

        Book[] bookArray = new Book[3];

        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = book3;

        for (int i = 0; i < bookArray.length; i++) {
            System.out.println();
            System.out.print(bookArray[i].getName());
            System.out.print(" = ");
            for (int j = 0; j < bookArray[i].getBooks().length; j++) {
                System.out.print(bookArray[i].getBooks()[j] + ", ");
            } 
        }
    }
}