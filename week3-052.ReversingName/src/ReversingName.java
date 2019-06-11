import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type name: ");
        String name = reader.nextLine();
        int i = name.length();

        System.out.print("In reverse order:");

       while (i>=1) {
            char character = name.charAt(i-1);
            System.out.print(character);
            i--;
        }

    }
}
