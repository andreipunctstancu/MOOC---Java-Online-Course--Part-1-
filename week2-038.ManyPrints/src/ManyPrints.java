
import java.io.Reader;
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method


    public static void main(String[] args) {

        // ask the user how many times the text should be printed
        // use the while structure to call the printText method several times
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        int number = Integer.parseInt(reader.nextLine());
        int initial = 1;

        while (initial <= number) {
            printText();
            initial++;
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
