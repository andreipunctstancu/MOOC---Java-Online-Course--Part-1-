import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int number = 0;
        double average = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        System.out.println(" Type numbers: ");
        while (true) {

            int read = Integer.parseInt(reader.nextLine());

            if (read == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            sum += read;
            number++;
            if (read % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }

        }
        average = sum / number;
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + number);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);


    }
}
