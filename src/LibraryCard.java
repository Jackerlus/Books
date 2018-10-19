public class LibraryCard {
    private int maxBooks;
    private int currentBooks;
    private String ref;

    public LibraryCard(int cardMaxBooks, String cardReference) {
        maxBooks = cardMaxBooks;
        ref = cardReference;
        currentBooks = 0;
    }
        public void swipe() {
            currentBooks++;
        }

        public boolean expired() {
            if (currentBooks == maxBooks) {
                return true;
            } else {
                return false;
            }
        }

        public String getCardRef() {
            return ref;
        }

        public void describe() {
            String text = "Library card " + ref + " with " + (maxBooks - currentBooks) + " books left.";
            System.out.println(text);
        }
    }