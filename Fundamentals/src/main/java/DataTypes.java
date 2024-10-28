public class DataTypes {
    public static void main(String[] args) {

        double gradeexam1 = 89.5;
        double gradeexam2 = 88.5;
        double gradeexam3 = 91.5;

        double gradeAverage = (gradeexam1 + gradeexam2 + gradeexam3) / 3;

        System.out.println("Grade exam1: " + gradeexam1);
        System.out.println("Grade exam2: " + gradeexam2);
        System.out.println("Grade exam3: " + gradeexam3);
        System.out.println("Grade Average: " + gradeAverage);

        String formattedAvg = String.format("%.2f", gradeAverage);
        System.out.println("Formatted Average:" + formattedAvg);
    }
}
