import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Grade Exam1: ");
        double gradeexam1 =scanner.nextDouble();

        System.out.println("Enter Grade Exam2: ");
        double gradeexam2 = scanner.nextDouble();

        System.out.println("Enter Grade Exam3: ");
        double gradeexam3 = scanner.nextDouble();

        double gradeAverage = (gradeexam1 + gradeexam2 + gradeexam3) / 3;

        System.out.println("Grade exam1: " + gradeexam1);
        System.out.println("Grade exam2: " + gradeexam2);
        System.out.println("Grade exam3: " + gradeexam3);
        System.out.println("Grade Average: " + gradeAverage);

        String formattedAvg = String.format("%.2f", gradeAverage);
        System.out.println("Formatted Average:" + formattedAvg);

        scanner.close();
    }
}
