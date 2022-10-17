import java.util.Scanner;

public class Dec2Hex {
    //Write a program called Dec2Hex that prompts user for a positive decimal number, read as int, 
    //and print its equivalent hexadecimal string.
    public static void main(String[] args) {    
    
    int number;
    boolean isValid = false;
    Scanner input = new Scanner(System.in);

    final char[] hexValues = {'0', '1', '2', '3', '4', '5', '6', '7',
                              '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};


    do{ 
        System.out.println("Enter an integer value: ");
        number = input.nextInt();

        if(number >= 0 ){
            isValid = true;
        }
    }while(!isValid);

    input.close();



    if(0 > Character.digit(number, 10))
    {
        System.out.println("There is a problem with the integer you used.");
    }
    else
    {
        System.out.println();
    }
        
    






    }
}
