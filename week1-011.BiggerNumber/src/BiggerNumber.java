
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        System.out.println ("The biggeer number of the two numbers given was: " + Math.max(firstNumber, secondNumber));

        // Implement your program here. Remember to ask the input from user
    }
}
