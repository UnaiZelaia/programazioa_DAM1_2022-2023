import java.util.Scanner;

public class Datak {
    /*
     * Erabiltzaileari data bat zehazteko eskatu ondoren, data hori formatu laburrean eta gero
     * luzean inprimatuko ditu programa honek. Horretarako, goiburuko hau duten funtzioak erabili
     * beharko dituzu:
     * 
     * public static String dataLaburra(int urtea, int hilabetea, int eguna)
     * public static String dataLuzea(int urte, int hilabetea, int eguna)
     * 
     * Prozesu hau erabiltzaileak nahi betse errepikatuko da.
     */

    //Metodoen definizioa:
    public static String dataLaburra(int urtea, int hilabetea, int eguna){
        String formatua = urtea + "-" + hilabetea + "-" + eguna;
        return formatua;
    }

    public static String dataLuzea(int urtea, int hilabetea, int eguna){
        String hilabeteaStr = "";
        switch(hilabetea){
            case 1:
                hilabeteaStr = "Urtarrilla";
                break;
            case 2:
                hilabeteaStr = "Otsaila";
                break;
            case 3:
                hilabeteaStr = "Martxoa";
                break;
            case 4:
                hilabeteaStr = "Apirila";
                break;
            case 5:
                hilabeteaStr = "Maiatza";
                break;
            case 6:
                hilabeteaStr = "Ekaina";
                break;
            case 7:
                hilabeteaStr = "Uztaila";
                break;
            case 8:
                hilabeteaStr = "Abuztua";
                break;
            case 9:
                hilabeteaStr = "iraila";
                break;
            case 10:
                hilabeteaStr = "Urria";
                break;
            case 11:
                hilabeteaStr = "Azaroa";
                break;
            case 12: 
                hilabeteaStr = "Abendua";
                break;
        }

        String formatua = urtea + "ko " + hilabeteaStr + "ren " + eguna + "a";
        return formatua;
    }


    //MAIN metodoa.
    public static void main(String[] args) {
        int urtea;
        int hilabetea;
        int eguna;
        Scanner input = new Scanner(System.in);
        String BaiEz;
        boolean berriro;



        do{
            System.out.print("Urtea: ");
            urtea = input.nextInt();

            System.out.print("Hilabetea: ");
            hilabetea = input.nextInt();

            System.out.print("Eguna: ");
            eguna = input.nextInt();

            System.out.println("Data formatu laburrean: " + dataLaburra(urtea, hilabetea, eguna));
            System.out.println("Data formatu luzean: " + dataLuzea(urtea, hilabetea, eguna));




            System.out.print("Beste data bat sartu nahi duzu (B/E)? ");
            BaiEz = input.next();
            if(BaiEz.equals("B") || BaiEz.equals("b")){
                berriro = true;
            }
            else{
                berriro = false;
            }
        } while(berriro);

        input.close();
    }
}
