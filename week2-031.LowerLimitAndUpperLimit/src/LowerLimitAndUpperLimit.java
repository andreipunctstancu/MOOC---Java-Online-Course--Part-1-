
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        int enumeration;

        while (firstNumber<=secondNumber) {
            enumeration = firstNumber;
            System.out.println(enumeration);
            firstNumber++;
            }


        }
    }

