import java.util.ArrayList;
import java.util.Scanner;


/** Programa honek langile berri bat txertatuko du zerrendan. Hauek dira programak jarraituko dituen pausuak:
 * 1.- Langileen zerrenda eskuratu (metodo egokiari deituta)
 * 2.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 * 3.- Erabiltzaileari langile berriaren datuak eskatu eta 
 * 4.- Langilea sortu
 * 5.- Langilea zerrendan txertatu
 * 6.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 */
public class LangileBerria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String datuak[] = new String[2];
        ArrayList<Langilea> langileak = new ArrayList<>();
        langileak = Langilea.getLangileenZerrenda();
        Langilea.langileakInprimatu(langileak);

        System.out.print("Langilea berriaren izen abizenak idatzi espazioz banaduta: ");
        for(int i = 0; i < 2; i++){
            datuak[i] = input.next();
        }
        
        input.close();

        langileak.add(new Langilea(datuak[0], datuak[1]));
        Langilea.langileakInprimatu(langileak);

        
    }    
}
