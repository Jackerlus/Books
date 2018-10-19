public class Library {
    private TextBook[] bookShelf;
    private int nextBook;
    private int totalCards;

    public Library(int totalBooks) {

    }

    public LibraryCard issueCard() {
        totalCards++;
        LibraryCard card = new LibraryCard(5, "cardID" + totalCards);
        return card;
    }

    public TextBook borrowBook(LibraryCard card) {
        if (!card.expired()) {
            card.swipe();
            return bookShelf[0]; //Placeholder
        }
    }

    public void returnBook() {

    }

    public void describe() {
        String libraryDesc = "There are 15 books left on the shelf and " + totalCards + " library cards have been issued";
        System.out.println(libraryDesc);
    }
}