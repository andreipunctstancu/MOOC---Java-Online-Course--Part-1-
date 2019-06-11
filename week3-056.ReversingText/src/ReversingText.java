
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = text.length();
        String help = "";
        while (i>=1){
            char character = text.charAt(i-1);
            help = help + character;
            i--;
        }

        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
