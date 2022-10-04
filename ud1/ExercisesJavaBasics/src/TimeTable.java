import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        //Write a program called TimeTable that prompts user for the size (a positive integer in int)
        //and prints the multiplication table as shown

        int number;

        boolean isValid = false;

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if(number > 0){
                isValid = true;
                input.close();
            }
        }while(!isValid);



    }
}
