import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) throws Exception {

        int number;
        Scanner input = new Scanner(System.in);
        boolean isValid = false;

        do{
            number = input.nextInt();
            if(number >= 0 && number <= 5){
                isValid = true;
            }
        }while(!isValid);

        input.close();

        for(int i = 0; i < number; i++){
            System.out.println("Hola mundo.");
        }
    }
}
