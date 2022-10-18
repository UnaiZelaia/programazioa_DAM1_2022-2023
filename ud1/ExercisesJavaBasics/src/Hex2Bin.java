import java.util.Scanner;

public class Hex2Bin {
    //Write a program called Hex2Bin that prompts user for a hexadecimal string 
    //and print its equivalent binary string.

    public static void main(String[] args) {

        String hexStr;
        int bin;
        Scanner input = new Scanner(System.in);

        //Table with the first 16 binary numbers to make the parse/lookup
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                                   "0100", "0101", "0110", "0111",
                                   "1000", "1001", "1010", "1011",
                                   "1100", "1101", "1110", "1111"};

        //Take input from user.
        System.out.print("Enter a hex string: ");
        hexStr = input.next();
        input.close();


        //Check for each character in the string for valid hex digit
        for (int i = 0; i < hexStr.length(); i++) {
			if (0 > Character.digit(hexStr.toLowerCase().charAt(i), 16)) {
                //The method above returns -1 if false.
                //https://www.geeksforgeeks.org/character-digit-in-java-with-examples/
				System.out.println("This hex string is not properly formed.");
			}
            else{
                //If it is a valid hex, we convert it to decimal and use that to index our HEX_BITS array.
               bin = Character.digit(hexStr.toLowerCase().charAt(i), 16);
               System.out.print(HEX_BITS[bin] + " ");
            }
		}
        System.out.println();
    }
}
