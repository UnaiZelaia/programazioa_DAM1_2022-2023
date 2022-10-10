import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        //Write a program called CountVowelsDigits, which prompts the user for a String, 
        //counts the number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) 
        //contained in the string, and prints the counts and the percentages 
        //(rounded to 2 decimal places)

        int countNumber = 0;
        int countVowel = 0;
        char c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.next().toLowerCase();
        input.close();

        for(int i = 0; i < word.length(); i++){
            c = word.charAt(i);
            if(c >= '0' && c <= '9'){
                countNumber++;
            }
            else if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                countVowel++;
            }
        }

        float countVowelFloat = countVowel;
        float countNumberFloat = countNumber;

        float percentVowels = word.length() / countVowelFloat;
        float percentNumbers = word.length() / countNumberFloat;

        System.out.println("There are " + countNumber + " numbers in the string: " + percentNumbers + "%");
        System.out.println("There are " + countVowel + " vowels in the string: " + percentVowels + "%");

        
    }
}
