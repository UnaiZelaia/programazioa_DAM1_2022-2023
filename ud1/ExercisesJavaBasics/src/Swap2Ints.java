import java.util.Scanner;

public class Swap2Ints {
    public static void main(String[] args) {
        //Declare int variables
        int num1, num2;

        //Create Scanner object.
        Scanner input = new Scanner(System.in);
        
        //Scan for numbers and save them in our int variables.
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        input.close();

        //swap the number using a third, temporary variable.
        int temp = num1;
        num1 = num2;
        num2 = temp;
        

        System.out.println("The first value is " + num1 + " and the second value is " + num2);
    }
}
