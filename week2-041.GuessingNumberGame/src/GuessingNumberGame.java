
import java.io.Reader;
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int counter = 1;


        while (true){
            System.out.println("Guess a number: ");
            int number = Integer.parseInt(reader.nextLine());

            if (number == numberDrawn){
                System.out.println("Congratulations, your guess is correct!, guesses made: " + counter);
                break;
            }

            if (number < numberDrawn) {
                System.out.println("The number is greater, guesses made:" + counter);
            }
            else if (number > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + counter);
            }
            counter++;

        }

        // program your solution here. Do not touch the above lines!

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
