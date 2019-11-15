
//Green Glass World program
import java.util.Scanner;
//main class
public class GreenGlassWorld {
    //method to check if the word is in the GGW and return true/false
    public static boolean greenGlassInput(String word) {
        if(word.length() <= 1) {
            return false;
        }
        for(int i = 1; i < word.length(); i++) {
            if(word.charAt(i - 1) == word.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        //asks for user input 
        System.out.print("Enter one word: ");
        userInput = input.next();
        //prints true or false 
        System.out.println(greenGlassInput(userInput));
    }
}
