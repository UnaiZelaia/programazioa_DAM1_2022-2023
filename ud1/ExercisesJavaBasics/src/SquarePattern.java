import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        //Write a program called SquarePattern that prompts user for the size 
        //(a non-negative integer in int); and prints the following square pattern using 
        //two nested for-loops.

        int size;
        boolean isValid = false;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter a size for the pattern: ");
            size = input.nextInt();
            if(size > 0){
                isValid = true;
                input.close();
            }
        }while(!isValid);

        for(int rows = 1;rows <= size; rows++){
            for(int cols = 1; cols <= size; cols++){
                System.out.print("# ");
            }
            System.out.println();
        }

        
    }
}
