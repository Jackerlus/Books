package src;

import java.util.ArrayList;
import java.util.Random;

public class College {
    private ArrayList<Student> collegeStudents = new ArrayList<Student>();
    private Library collegeLibrary;
    private Random randomStudent = new Random();

    public College(int numStudents, int numTextBooks) {
        collegeLibrary = new Library(numTextBooks);
        String studentName;
        for (int i = 0; i < numStudents; i++) {
            studentName = "Student" + Integer.toString(i + 1);
            collegeStudents.add(new Student(studentName, collegeLibrary));
        }
    }

    public void describe() {
        System.out.println(collegeStudents.size() + " students currently attend this college.");
        collegeLibrary.describe();
    }

    private void nextStep() {
        if (collegeStudents.size() == 0) {
            System.out.println("Everyone has graduated.");
            return;
        }
        Student chosenStudent = collegeStudents.get(randomStudent.nextInt(collegeStudents.size()));

        if (chosenStudent.finishedStudies()) {
            System.out.println("This student has now graduated.");
            collegeStudents.remove(chosenStudent);
        } else {
            chosenStudent.study();
        }
    }

    public void runCollege(int nSteps) {
        for (int i = 0; i < nSteps; i++) {
            System.out.println("Step " + i);
            this.describe();
            nextStep();
        }
    }

    public static void main(String[] args) {
        College initCollege = new College(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        initCollege.runCollege(Integer.parseInt(args[2]));
    }
}
