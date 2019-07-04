import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/*Create a program that asks the user to input words, until the user gives an empty string. 
Then the program prints the words the user gave in reversed order, the last word is printed first etc.*/

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        String input = "placeholder"; //give string a default value
        
        while (!input.equals("")) {
            System.out.println("Type a word: ");
            input = reader.nextLine();
            
            words.add(input);
        }
        
        //reverse ArrayList
        Collections.reverse(words);
        
        //print out reversed list of words
        System.out.println("You typed the following words:");
        
        for (String word: words) {
            System.out.println(word);
        }
        
    }
}
