import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        //Write a program that prompts user for a positive integer. 
        //The program shall read the input as int; and print the "reverse" of the input integer

        //Declare empty string, which will hold our reveersed number.
        String reversedNumber = ""; 

        //Declare a Scanner object. Name it input.
        Scanner input = new Scanner(System.in);

        //Prompt the user to input a number using the scanner and then close the scanner.
        System.out.print("Input an integer to reverse it: "); 
        int number = input.nextInt();
        input.close();

        //Print the number which wil be reversed.
        System.out.print(number + " Reversed is: ");

        //Loop to extract each digit of the number and add it to our string
        while(number > 0){
            //With the modulo operator we extract the last digit of the number using 10.
            int digit = number % 10;

            //We add the extracted number to our string.
            reversedNumber = reversedNumber + digit; 

            //Then we remove the last number from our number.
            //The loop will then execute again with last digit of the number removed.
            number = number / 10;
        }
        //Print the end product: The reversed number.
        System.out.println(reversedNumber);
    }
}
