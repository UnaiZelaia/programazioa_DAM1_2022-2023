
import java.util.ArrayList;


public class Langilea {

    private String izena;
    private String abizena;
    private String emaila;
    private double soldata;

    /**
     * Konstruktore honek Langilea objetu bat sortuko du jasotako parametroak
     * kontuan izanda.
     */
    public Langilea(String izena, String abizena, String emaila, double soldata) {
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
        this.soldata = soldata;
    }

    /**
     * Konstruktore honek automatikoki kalkulatuko du emaila patroi hau jarraituz:
     * abizena.izena@bertsozale.eus
     * email guztiak minuskulaz.
     * Lehenetsitako soldata esleituko zaio gainera langileari; 1200 euroko soldata.
     * 
     * @param izena
     * @param abizena
     */
    public Langilea(String izena, String abizena) {

       this.izena = izena;
       this.abizena = abizena;
       this.emaila = abizena + "." + izena + "@bertsozale.eus";
       this.soldata = 1200.00;

    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getEmaila() {
        return emaila;
    }

    public double getSoldata() {
        return soldata;
    }

    public void setEmaila(String emaila) {
        this.emaila = emaila;
    }

    /**
     * Langilearen soldata aldatzeko erabiliko da metodo hau.
     * Atributoa aldatzeaz gain, soltata berria bueltatuko du metodoak.
     * 
     * @param portzentaia Igoeraren portzentaia. Adibidez,
     *                    10 balioak, %10eko igoera adierazten du
     *                    50 balioa pasa beharko genuke soldataren erdia igo nahiko
     *                    bagenu.
     * @return soldataBerria
     */
    public double soldataIgo(int portzentaia) {
        this.soldata = soldata + (soldata * portzentaia) / 100;
        return 0;
    }

    /**
     * Langilearen datuak String formatuan itzultzen ditu;
     * zehazki, klasearen izenaren ostean eta kortxete artean atributo guztien
     * balioak komaz bananduta.
     * 
     */
    @Override
    public String toString() {
        return "[" + this.izena + ", " + this.abizena + ", " + this.emaila + ", " + this.soldata + "]";
    }

    /**
     * EZ IKUTU METODO HAU
     * Metodo honi langileen zerrenda bat behar duenak deituko dio. *
     * 
     * @return Hiru langileren datuak dauzkan arraylista bueltatzen du.
     */
    public static ArrayList<Langilea> getLangileenZerrenda() {
        ArrayList<Langilea> langileak = new ArrayList<>();
        langileak.add(new Langilea("Alaia", "Martin"));
        langileak.add(new Langilea("Nerea", "Ibarzabal"));
        langileak.add(new Langilea("Maialen", "Lujanbio", "lujanbio.maialen@bertsozale.eus", 2000));

        return langileak;
    }

    /**
     * Itxura honetako taula bat inprimatuko du:
     *
     * Langileen Zerrenda (LangileKopurua)
     * ==========================================
     * Lehen langilearen datuak
     * Bigarren langilearen datuak
     * Hirugarren langilearen datuak
     * ...
     * 
     * @param Inprimatu nahi den zerrenda
     */
    public static void langileakInprimatu(ArrayList<Langilea> lk) {
        System.out.printf("Langileen Zerrenda (" + lk.size() + ")\n");
        System.out.println("==================================================================");
        for(Langilea langilea : lk){
            System.out.println(langilea.toString());
        }
    }

    /**
     * Metodo honek uneko objektuaren emaila egokia den, hau da, zerrendan
     * existitzen den egiaztatzen du.
     * 
     * @param lk Egiaztatu beharreko zerrenda
     * @return Zerrendan email helbide hori dagoeneko baldin badaukagu, false
     *         bueltatzen du
     */

    public boolean emailEgokia(ArrayList<Langilea> lk) {
        for(Langilea langilea : lk){
            if(langilea.emaila.equals(this.emaila)){
                return false;
            }
        }
        return true;
    }

    /** Langile honen email originalari zenbakitxo bat gehitzen dio @ ikurraren aurretik.
     * Adibidez:
     * perez.juan@uni.eus => perez.juan2@uni.eus     
     * 
     */
    public void emailaDoitu() {
        String parteak[] = emaila.split("@");
        parteak[0] = parteak[0] + 7;
        String osatua = parteak[0] + "@" + parteak[1];

        this.emaila = osatua;
    }
}
