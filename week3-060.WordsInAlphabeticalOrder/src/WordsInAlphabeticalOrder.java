
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words  = new ArrayList<String >();


        while (true){
            System.out.println("Type a word: ");
            String input = reader.nextLine();

            if (input.isEmpty()){
                break;
            }
            words.add(input);
        }
        Collections.sort(words);

        for (String results: words){
            System.out.println(results);
        }
    }


}
