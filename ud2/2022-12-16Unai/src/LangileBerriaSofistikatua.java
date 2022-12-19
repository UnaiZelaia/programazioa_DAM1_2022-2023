import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/** Programa honek langile berri bat txertatuko du zerrendan. 
 * Hauek dira programak jarraituko dituen pausuak:
 * 1.- Langileen zerrenda eskuratu (metodo egokiari deituta)
 * 2.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 * 3.- Langile berria eskuratu (datuakEskatu metodoari deituta)
 * 4.- Langile berriaren emaila ez bada egokia (errepikatuta dagoelako) emaila ajustatu
 * 5.- Langilea zerrendan txertatu
 * 6.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 */
public class LangileBerriaSofistikatua {
    public static void main(String[] args) {

        ArrayList<Langilea> langileak = new ArrayList<>();
        langileak = Langilea.getLangileenZerrenda();

        Langilea.langileakInprimatu(langileak);
        Langilea berria = datuakEskatu();
        
        boolean emailCheck = berria.emailEgokia(langileak);

        if(!emailCheck){
            berria.emailaDoitu();
        }

        langileak.add(berria);

        System.out.println();
        Langilea.langileakInprimatu(langileak);


        
    }

    /** Metodo honek langile berri baten datuak eskatzen dizkio erabiltzaileari.
     * Ez badu soldata zenbakitan, behar bezala sartzen, 1200eko soldata asignatuko zaio.
     * 
     * @return Langile berria
     */
    public static Langilea datuakEskatu() {
        String izena, abizena, emaila;
        double soldata;

        Scanner input = new Scanner(System.in);
        System.out.println("LANGILE BERRIA");

        System.out.print("\t Izena: ");
        izena = input.next();

        System.out.print("\t Abizena: ");
        abizena = input.next();

        System.out.print("\t Emaila: ");
        emaila = input.next();

        try{
            System.out.print("\t Soldata: ");
            soldata = input.nextDouble();
        }catch(InputMismatchException ex){
            System.out.println("Soldata ezegokia sartu duzu, beraz, lehenetsia esleituko dugu");
            soldata = 1200.00;
        }
        input.close();

        Langilea langilea = new Langilea(izena, abizena, emaila, soldata);
        
        return langilea;
    }

}
