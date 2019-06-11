
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int firstNumber = Integer.parseInt(reader.next());

        System.out.println("Type another number: ");
        int secondNumber = Integer.parseInt(reader.next());

        double divide = (double) firstNumber / secondNumber;
        System.out.println("Division: " + firstNumber +  " / " + secondNumber + " = " + divide );

        // Implement your program here. Remember to ask the input from user.
    }
}
