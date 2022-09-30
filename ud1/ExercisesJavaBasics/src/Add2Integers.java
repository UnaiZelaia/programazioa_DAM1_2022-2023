import java.util.Scanner;
public class Add2Integers {
    public static void main(String[] args) {
    /**
    * 1. Prompt user for 2 integers
    * 2. Read inputs as "int"
    * 3. Compute their sum in "int"
    * 4. Print the result
    */
    int num1, num2, sum;

    Scanner input = new Scanner(System.in); //Create the scanner for user input

    System.out.println("This program adds 2 numbers together\n");

    System.out.print("Enter first number: ");
    num1 = input.nextInt(); //Use nextInt() method of the Scanner class to read user input(int)
                            //We save that input in num1
    
    System.out.print("Enter second number: ");
    num2 = input.nextInt(); //We do the same. save user input in num2.

    input.close(); //Close the scanner.

    sum = num1 + num2;
    System.out.println("The sum is " + sum);


    }
}
