import java.util.Scanner;

public class Palindromi {


    public static String reversOrder (String text){
        int i = text.length()-1;
        String help = "";
        while (i>=0){
            char character = text.charAt(i);
            help=help+character;
            i--;
        }return help;
    }

    public static boolean palindrome(String text) {
        String normalOrder = text;
        if (normalOrder.equals(reversOrder(text))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
