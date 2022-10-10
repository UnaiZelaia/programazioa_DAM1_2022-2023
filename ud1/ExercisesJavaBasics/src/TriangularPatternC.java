import java.util.Scanner;

public class TriangularPatternC {
    public static void main(String[] args) {

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
            for(int cols = size; cols >= 1; cols--){
                if(row >= cols){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
