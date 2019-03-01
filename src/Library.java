package src;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class Library {
    private TextBook[] bookShelf;
    private int nextBook;
    private int totalCards;

    public Library(int totalBooks) {
        Random rand = new Random();
        bookShelf = new TextBook[totalBooks];
        int  n;
        String bookName = "";

        for (int i = 0;i < totalBooks;i++) {
            bookName = "Book " + (i + 1);
            n = rand.nextInt(30) + 1;
            bookShelf[i] = new TextBook(bookName, n);
            System.out.println(bookShelf[i]);
        }
    }

    public LibraryCard issueCard() {
        totalCards++;
        return new LibraryCard(5, "cardID " + totalCards);
    }

    public TextBook borrowBook(LibraryCard card) {
        TextBook cBook;
        if (bookShelf.length > 0 && card != null && !card.expired()) {
            card.swipe();
            cBook = bookShelf[nextBook];
            bookShelf[nextBook] = null;
            nextBook++;
            return cBook;
        }
        return null;
    }

    public void returnBook(TextBook book) {
        if (book != null) {
            String bookName = book.getTitle();
            int bookNum = parseInt(bookName.substring(bookName.length() - 1));
            bookShelf[bookNum - 1] = book;
        }
    }

    public void describe() {
        int numBooks = 0;
        for (int i = 0;i < bookShelf.length; i++) {
            if (bookShelf[i] != null) {
                numBooks++;
            }
        }
        String libraryDesc = "There are " + numBooks + " books left on the shelf and " + totalCards + " library cards have been issued";
        System.out.println(libraryDesc);
    }
}