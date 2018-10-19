public class TextBook {
    private String title;
    private int length;
    private int lastChapter;

    public TextBook(String bookTitle, int bookLength) {
        title = bookTitle;
        length = bookLength;
        lastChapter = 0;
    }

    public String getTitle() {
        return title;
    }

    public void readNextChapter() {
        if (lastChapter < length) {
            lastChapter++;
        } else {
            System.out.println("Error - book finished.")
        }
    }

    public boolean isFinished() {
        if (lastChapter == length) {
            return true;
        } else {
            return false;
        }
    }

    public void closeBook() {
        lastChapter = 0;
    }

    public void describe() {
        private String text = bookTitle + " with " + (bookLength - lastChapter) " chapters left to read."
        System.out.println(text);
    }
}