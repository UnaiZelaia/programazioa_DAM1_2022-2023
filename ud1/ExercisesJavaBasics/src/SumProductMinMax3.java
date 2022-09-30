import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int num1, num2, num3, sum, product, min, max;

        System.out.println("This program asks for 3 ints and shows their sum, product, min and max");

        Scanner input = new Scanner(System.in); //Create Scanner object. Name it input.

        System.out.print("Enter first number: "); //Scan for next integer from user and save it on num1
        num1 = input.nextInt();                   //Repeat for each number.

        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        
        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        input.close(); //Close the scanner.

        //Make the operations with the numbers that the user has input.
        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;

        //Find the higest and lowest of the 3 numbers.
        //Since Math.max() and Math.min() only take 2 arguments, we have to get do it this way.
        //We use the result of one min or max operation as the argument for another one.
        max = Math.max(num1, Math.max(num2, num3));
        min = Math.min(num1, Math.min(num2, num3));

        //Print the messages with the results.
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The lowest number is: " + min);
        System.out.println("The highest number is: " + max);

    }
}
