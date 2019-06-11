
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int from = Integer.parseInt(reader.nextLine());

        System.out.println("Last: ");
        int to = Integer.parseInt(reader.next());


        int sum = 0;

        while (from<=to) {
            sum += from;
            from++;
        }

        System.out.println("The sum " + sum);
    }
}
