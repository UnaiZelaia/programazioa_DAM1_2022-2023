import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
    }









    
    //Method returns false if number is even and true if it's odd.
    public static boolean isOdd(int number){
        return (number % 2 == 0) ? false : true;
    }

    //Method that calculates the exponent given a base and an exponent.
    public static int exponent(int base, int exp){
        int product = 1;
        for(int i = 1; i <= exp;i++){
            product *= base;
        }
        return product;
    } 

    //Method that return true if any digit of a number is eight.
    public static boolean hasEight(int number){
            while(number > 0){
                int digit = number % 10;
                if(digit == 8){
                    return true;
                }
                number = number / 10;
            }
            return false;
    }
}
