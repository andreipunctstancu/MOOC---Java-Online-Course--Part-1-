import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();



        while (true) {
            System.out.println("Type a word: ");
            String input = reader.nextLine();
            if (input.isEmpty()) {
                break;
            }else {

                words.add(input);
            }
        }
        System.out.println("You typed the following words: ");

        for (String wordsAdded: words){
            System.out.println(wordsAdded);
        }


    }


}

