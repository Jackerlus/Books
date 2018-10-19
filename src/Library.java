public class Library {
    private TextBook[] bookShelf[10, 10];
    private int nextBook;
    private int totalCards;

    public Library(int totalBooks) {

    }

    public LibraryCard issueCard() {
        totalCards++;
        return card = new LibraryCard(5, "cardID" + totalCards);
    }

    public TextBook borrowBook(LibraryCard card) {
        if (card.maxBooks > card.currentBooks) {
            
        }
    }
}