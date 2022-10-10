import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //Write a program called ReverseString, which prompts user for a String, 
        //and prints the reverse of the String by extracting and processing each character

        String word;
        String reversedWord = "";
        Scanner input = new Scanner(System.in);
        int strLenght;

        System.out.print("Enter a word: ");
        word = input.nextLine();
        input.close();
        strLenght = word.length();

        //Initialize i to the lenght of the line - 1 to account for the index starting at 0.
        //Then loop through the word taking aout chars with charAt(i) and putting them in a string
        for(int i = strLenght - 1; i >= 0; i--){
            char c = word.charAt(i);
            reversedWord = reversedWord + c;
        }

        System.out.println("The word reversed is " + reversedWord);


    }
}
