import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        //Write a program that prompts user for an integer between 0-10 or 90-100. 
        //The program shall read the input as int and repeat until the user enters a valid input

        int numberIn;
        boolean isValid;

        isValid = false;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberIn = input.nextInt();
            if((numberIn >= 0 && numberIn <= 10) || (numberIn >= 90 && numberIn <=100)){
                isValid = true;                
            }
            else{
                System.out.println("Error. The number should be between 0-10 or 90-100");
            }
        }
        while(isValid == false);

        input.close();
        System.out.println("Good job. The number " + numberIn + " is valid");
    }

}
