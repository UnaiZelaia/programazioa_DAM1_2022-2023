import java.util.Arrays;
import java.util.Scanner;

public class Bikoitza {
   /*
    * Programa honek zenbait zenbaki oso eskatuko dizkio erabiltzaileari eta array
    * baten gordeko ditu.
    * Gero, tamaina berdineko beste array baten, elementu bakoitzaren bikoitza
    * sartuko ditu.
    * Zenbaki kopurua TAMAINA izeneko final aldagai baten egongo da zehaztuta.
    * Arrayen edukia Arrays.toString() metodoa erabiliz inprimatuko da.
    * Integer.parseInt();
    */

   public static void main(String[] args) {
      final int TAMAINA = 5;
      Scanner input = new Scanner(System.in);
      int zenbakiak[];
      int zenbakiakBider2[];

      zenbakiak = new int[TAMAINA];
      zenbakiakBider2 = new int[TAMAINA];

      System.out.print("Sartu itzazu " + TAMAINA + " zenbaki espazioz bananduta: ");


      //El metodo nextInt permite coger varios numeros separados por espacios
      //Puedes escribir un input como: 2 4 5 6 3
      //y el metodo recogera cada uno de los ints (loopeando)
      for(int i = 0; i < TAMAINA; i++){
         zenbakiak[i] = input.nextInt();
         zenbakiakBider2[i] = zenbakiak[i] * 2;
      }
      input.close();

      System.out.println(Arrays.toString(zenbakiak));
      System.out.println(Arrays.toString(zenbakiakBider2));
   }
}