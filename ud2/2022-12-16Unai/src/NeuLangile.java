

/** Programa honek zure izen abizenak daramatzan erabiltzailea sortuko du, lehenetsitako email eta soldatarekin.
 * Langilearen datuak kontsolatik bistaratu ondoren.
 * Soldata igo eta berriz inprimatuko du langilearen informazioa.
 */
public class NeuLangile {
    public static void main(String[] args) throws Exception {
        Langilea unai = new Langilea("unai", "zelaia");

        System.out.println("Nire langile datuak igoera aurretik:");
        System.out.println(unai.toString()); 

        unai.soldataIgo(50);

        System.out.println("Nire langile datuak igoera ostean:");
        System.out.println(unai.toString()); 
        
    }
}
