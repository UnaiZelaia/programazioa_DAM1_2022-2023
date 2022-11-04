import java.util.Scanner;

public class Izartxoak {
    /* Programa honek 1etik 50arteko zenbakiak inprimatuko ditu pantailan
     * marratxoz bananduta. Hori bai, erabiltzaileak aukeratutako zenbakiaren multiplo
     * diren zenbakiak izartxo batez ordezkatuko dira.
     */
    public static void main(String[] args){
        final int max = 50;
        int multiploa;
        Scanner input = new Scanner(System.in);
        boolean valid;

        do{
            System.out.print("Esan zenbaki bat (1-10): ");
            multiploa = input.nextInt();
            if(multiploa > 0 && multiploa <=10){
                valid = true;
            }
            else{
                valid = false;
            }
        }while(!valid);
        input.close();


        for(int i = 1; i <= max; i++){
            if(i % multiploa == 0){
                System.out.print(" * ");
            }
            else{
                System.out.print(" " + i + " ");
            }
            System.out.print("-");
        }

    }
}
