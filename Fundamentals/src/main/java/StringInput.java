import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your favourite color ? ");

        String TheColor = scanner.nextLine();

        System.out.print("What is your hobby ? ");

        String TheCoding = scanner.nextLine();

        System.out.println("My favourite color is " + TheColor);
        System.out.println("My hobby is " + TheCoding);

        scanner.close();
    }
}
