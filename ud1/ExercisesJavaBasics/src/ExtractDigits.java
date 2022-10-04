public class ExtractDigits {
    public static void main(String[] args) {
        //Write a program called ExtractDigits to extract each digit from an int, in the reverse order. 
        //For example, if the int is 15423, the output shall be "3 2 4 5 1", with a space separating the digits.

        int number = 15423;

        while(number > 0){
            int digit = number % 10; //Extraer último dígito del número.
            System.out.print(digit);

            if(number < 10){ //Checkear si el último número ya ha sido imprimido para meter una nueva linea
                System.out.println("\n"); //Si no sale un % al final de la ejecución.
            }

            number = number / 10; //Eliminar último dígito del número 
        }
    }
}
