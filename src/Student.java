package src;

public class Student {
    private String studentName;
    private Library studentLibrary;
    private LibraryCard studentCard;
    private TextBook currentTextBook;

    public Student(String name, Library library) {
        studentName = name;
        studentLibrary = library;
        studentCard = library.issueCard();
        currentTextBook = null;
    }

    public boolean finishedStudies() {
        if (currentTextBook == null) {
            return true;
        } else {
            return false;
        }
    }

    public void study() {
        if (currentTextBook == null) {
            currentTextBook = studentLibrary.borrowBook(studentCard);
        } else if (!currentTextBook.isFinished()) {
            currentTextBook.readNextChapter();
        } else {
            currentTextBook.closeBook();
            studentLibrary.returnBook(currentTextBook);
            currentTextBook = null;
        }
    }

    public void describe() {
        if (currentTextBook != null) {
            System.out.println("The student has one book called "
                    + currentTextBook.getTitle());
        } else {
            System.out.println("The student has not taken out a book.");
        }
    }
}
