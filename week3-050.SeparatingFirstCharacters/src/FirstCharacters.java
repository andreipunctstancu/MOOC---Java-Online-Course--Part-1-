import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();

        if (name.length()>3){
            char firstLetter = name.charAt(0);
            System.out.println("1. character: " + firstLetter );
            char secondLetter = name.charAt(1);
            System.out.println("2. character: " + secondLetter);
            char thirdLetter = name.charAt(2);
            System.out.println("3. character: " + thirdLetter);
        }
    }
}
