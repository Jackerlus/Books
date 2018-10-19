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
            System.out.println("Error - book finished.");
        }
    }

    public boolean isFinished() {
        return lastChapter == length;
    }

    public void closeBook() {
        lastChapter = 0;
    }

    public void describe() {
        String text = title + " with " + (length - lastChapter) + " chapters left to read.";
        System.out.println(text);
    }
}