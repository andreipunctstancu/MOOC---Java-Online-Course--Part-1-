import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        int factorial = 1;
        int repetition = 1;

        while (repetition <= number) {
            factorial *= repetition;
            repetition++;

        }

        System.out.println("The factorial is: " + factorial);

    }
}
