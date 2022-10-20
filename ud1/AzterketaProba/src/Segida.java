import java.util.Scanner;

public class Segida {
    public static void main(String[] args) {
        /*
        Programa honek zenbaki oso positiboen segida inprimatuko du pantailan,
        zenbakiak multzotan bananduz. Segidako zenbakirik handiena eta multzo baten
        egongo diren zenbaki kopurua erabiltzaileari eskatuko zaizkio.
        */

        int kopurua, handiena;
        Scanner input = new Scanner(System.in);

        System.out.print("Zein da inprimatu nahi duzun azken zenbakia? ");
        handiena = input.nextInt();

        System.out.print("Zenbat zenbakiko multzoak nahi dituzu? ");
        kopurua = input.nextInt();

        input.close();

        for(int i = 1; i <= handiena; i++){
            System.out.println(i);
            if(i % kopurua == 0){
                System.out.println("=====");
            }
        }




    }
}
