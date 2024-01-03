import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        System.out.println("Enter the marks obtained in each subject: ");

        for (int i = 0; i < numSubjects; i++) {
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100);

        String grade = "";
        if (averagePercentage >= 90) {
            grade = "Grade A";
        } else if (averagePercentage >= 80) {
            grade = "Grade B";
        } else if (averagePercentage >= 70) {
            grade = "Grade C";
        } else if (averagePercentage >= 60) {
            grade = "Grade D";
        } else {
            grade = "Grade F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage * 100 + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
