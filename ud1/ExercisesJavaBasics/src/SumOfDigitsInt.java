import java.util.Scanner;

public class SumOfDigitsInt {
    public static void main(String[] args) {
        //Write a program that prompts user for a positive integer. 
        //The program shall read the input as int.
        //compute and print the sum of all its digits.
        int sum = 0;
        int digit = 0;

        System.out.print("Enter a number to add its digits: ");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        input.close();

        while(number > 0){
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("The sum of the digits of the number is: " + sum);
    }
}
