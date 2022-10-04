import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        //Write a program called CheckerPattern that prompts user for the size (a non-negative integer in int); 
        //and prints the following checkerboard pattern.

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

        for(int rows = 1; rows <= size; rows++){
            for(int cols = 1; cols <= size; cols++){
                if(rows % 2 == 0){
                    System.out.print(" #");
                }else{
                System.out.print("# ");
                }
            }
            System.out.println();
        }

    }
}
