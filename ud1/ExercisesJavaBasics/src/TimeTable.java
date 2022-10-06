import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        //Write a program called TimeTable that prompts user for the size (a positive integer in int)
        //and prints the multiplication table as shown

        int number, cols;

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

        for(int rows = 1; rows <= number; rows++){
            for(cols = 1; cols <= number; cols++){
                System.out.printf("%4d |%4d", rows, cols);
            }
            if(rows == 1){
                System.out.printf("* | %4d", cols);
                System.out.println("----------------------------------------");
            }
            System.out.println();
        }

        

    }
}
