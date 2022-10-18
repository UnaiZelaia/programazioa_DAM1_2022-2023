import java.util.Scanner;

public class PrintArray {
    //Write a program called PrintArray which prompts user for the number of items in an array 
    //(a non-negative integer), and saves it in an int variable called NUM_ITEMS. 
    //It then prompts user for the values of all the items and saves them in an int array called items. 
    //The program shall then print the contents of the array in the form of [x1, x2, ..., xn]
    public static void main(String[] args) {

        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        int NUM_ITEMS;
        int collection[];

        do{
            System.out.print("Enter the size of the array: ");
            NUM_ITEMS = input.nextInt();

            if(NUM_ITEMS > 0){
                isValid = true;
            }

        }while(!isValid);
        collection = new int[NUM_ITEMS];


        for(int i = 0; i < NUM_ITEMS; i++){
            System.out.println("Select the element number " + i);
            collection[i] = input.nextInt();
        }
        input.close();

        for(int i = 0; i < collection.length; i++){
            if(i == 0){
                System.out.print("[" + collection[i]);
            }
            else{
                System.out.print(", " + collection[i]);
            }
        }
        System.out.print("]\n");


    }
}
