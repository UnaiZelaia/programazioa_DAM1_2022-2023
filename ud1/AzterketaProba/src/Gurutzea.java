import java.util.Scanner;

/*
 * Programa honek gurutze bat marraztu beahr du kontsolan.
 * Erabiltzaileak aukeratutako tamainakoa. 
 * Pista: Posizio batzutan "0" karaktereak eta beste batzutan ". " karaktereak marrazten dira.
 */

public class Gurutzea {
    public static void main(String[] args) {

        int tamaina;
        Scanner input = new Scanner(System.in);
        boolean bakoitiaDa;

        //Eskatu neurriak.
        do{
            System.out.print("Zein neurritako gurutzea?: ");
            tamaina = input.nextInt();
            if(tamaina % 2 == 0){
                bakoitiaDa = false;
            }
            else{
                bakoitiaDa = true;
            }
        }while(!bakoitiaDa);

        input.close();

        //Logika gurutzea ataratzeko.
        for(int rows = 1; rows <= tamaina; rows++){
            for(int cols = 1; cols <= tamaina; cols++){
                if(cols % ((tamaina + 1) / 2) == 0){
                    System.out.print("0 ");
                }
                else if(rows % ((tamaina + 1) / 2) == 0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }


    }
}
