
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> helper = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if(words.contains(word)){
                helper.add(word);
                break;
            }
            words.add(word);
            }

            for (String input: helper){
            System.out.print("You gave the word " + input + " twice");
        }

        }


    }




