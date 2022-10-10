import java.util.Scanner;

public class TriangularPatternB {
    public static void main(String[] args) {
        /*
        Pattern to print (size 8):
        # # # # # # # #
        # # # # # # #
        # # # # # #
        # # # # #
        # # # #
        # # #
        # #
        #
        */
        //Declare needed variables
        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        int size;

        //Ask the user for input with validation(positive integer)
        do{
            System.out.print("Enter a number: ");
            size = input.nextInt();
            if(size > 0){
                isValid = true;
                input.close();
            }
            else{
                System.out.println("Error. number must be a positive integer.");
            }
        }while(!isValid);

        for(int row = 1; row <= size; row++){
            for(int cols = size; cols >= row; cols--){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
