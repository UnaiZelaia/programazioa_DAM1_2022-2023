import java.util.Scanner;

public class Menua {
    private static final int LAUKI_KOP = 10;
    private static int sortutakoak = 0;
    private static Laukia laukiak[];
    private static Scanner input = new Scanner(System.in);



    /**Creates a new square in laukiak[] if the square number has not exceede the LAUKI_KOP final variable.*/
    public static void sortu(){
        System.out.print("Zenbat lauki sortu gure dituzu? ");
        int kopurua = input.nextInt();
        laukiak =  new Laukia[kopurua];
        for(int i = 0; i < kopurua; i++){

            System.out.print("\tSartu zabalera " + (i+1) + ". karratuarentzat: ");
            double zabal = input.nextDouble();

            System.out.print("\tSartu altuera " + (i+1) + ". karratuarentzat: ");
            double altu = input.nextDouble();
            System.out.println();

            Laukia l = new Laukia(zabal, altu);

            if(sortutakoak < LAUKI_KOP){
                laukiak[sortutakoak] = l;
                sortutakoak++;
            }
            else{
                System.out.println("Ezin dira lauki gehiago sortu.");
            }
        }
    }




    public static void inprimatu(){
        if(laukiak != null){
            System.out.println("Laukia      zabalera      altuera      azalera      perimetroa      Mota      ");
            System.out.println("===================================================================================");
            for(int i = 0; i < laukiak.length; i++){
                System.out.printf("%6d %12.2f %12.2f %12.2f %12.2f %15s",
                                    i, laukiak[i].getZabalera(), laukiak[i].getAltuera(), laukiak[i].getAzalera(), laukiak[i].getPerimetroa(), laukiak[i].getMota());
                System.out.println();
            }
        }
        else{
            System.out.println("Ez da laukirik sortu oraindik.");
        }
    }

    public static void marraztu(){
        if(laukiak != null){
            System.out.print("Zein lauki marraztu nahi duzu? ");
            int laukia = input.nextInt();
            laukiak[laukia -1].marraztuBeteta();
        }
        else{
            System.out.println("Ez da laukirik sortu oraindik.");
        }
    }

    public static void handiena(){
        if(laukiak != null){
            System.out.println(Laukia.getTheBiggest(laukiak));
        }
        else{
            System.out.println("Ez da laukirik sortu oraindik.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean irten = false;
        int select;
        do{
            System.out.println("LAUKIAK\n\n========================================================");
            System.out.println("1.- Laukiak sortu (gehienez 10). ");
            System.out.println("2.- Laukien taula ikusi.");
            System.out.println("3.- Lauki bat marraztu.");
            System.out.println("4.- Lauki handiena bilatu.");
            System.out.println("5.- Irten.");
            select = input.nextInt();

            switch(select){
                case 1:
                    sortu();
                    break;
                case 2:
                    inprimatu();
                    break;
                case 3:
                    marraztu();
                    break;
                case 4:
                    handiena();
                    break;
                case 5:
                    irten = true;
                    break;
                default:
                    System.out.println("Sakatu 1, 2, 3, 4 edo 5.");
            }
            System.out.println("\n\n\n");
        }
        while(!irten);
        input.close();
    }
}