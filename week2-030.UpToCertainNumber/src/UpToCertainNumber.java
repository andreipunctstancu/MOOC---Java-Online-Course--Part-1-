
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Up to what number?");

        int sum = 1;
        int read = Integer.parseInt(reader.nextLine());


        while (sum <= read) {
            System.out.println(sum);
            sum++;
        }
        
    }
}
