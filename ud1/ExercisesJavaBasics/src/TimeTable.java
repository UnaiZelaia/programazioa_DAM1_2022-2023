import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        //Write a program called TimeTable that prompts user for the size (a positive integer in int)
        //and prints the multiplication table as shown

        int number, cols;

        boolean isValid = false;

        Scanner input = new Scanner(System.in);

        //Ask the user for input with validation(positive integer)
        do{
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if(number > 0){
                isValid = true;
                input.close();
            }
            else{
                System.out.println("Error. number must be a positive integer.");
            }
        }while(!isValid);



        //Print the time table
        for(int rows = 1; rows <= number; rows++){
            if(rows == 1){
                System.out.print("   *|");

                for(int p  = 1; p <= number; p++){
                    System.out.printf("%4d", p);
                }
                System.out.println();
                System.out.print("  ----");

                for(int p = 1; p <= number; p++){
                    System.out.print("----");
                }
                System.out.println();
            }
            System.out.printf("%4d|", rows);

            for(cols = 1; cols <= number; cols++){
                System.out.printf("%4d", cols * rows);
            }
            System.out.println();
        }
    }
}