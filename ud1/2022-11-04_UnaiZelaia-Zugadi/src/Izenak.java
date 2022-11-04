import java.util.Scanner;


public class Izenak {
    /*
     * Izen kopuru jakin batekin egiten du lan programa honek. Erabiltzaileak espazioz banaduta
     * Idatziko ditu. Gero, R sakatu ezkero, izenak atzeko aurrera zerrendatuko dira.
     * Sakatutakoa ez bada R, ez da ezer egingo.
     */
    public static void main(String[] args) {
        final int kopurua = 8;
        Scanner input = new Scanner(System.in);
        String izenak[];
        String izenakReverse[];
        izenak = new String[kopurua];
        izenakReverse = new String[kopurua];

        System.out.print("Idatzi " + kopurua + " izen: ");
        for(int i = 0; i < kopurua; i++){
            izenak[i] = input.next();
        }

        System.out.print("Sakatu R(everse) izenak atzekoz aurrera ikusteko: ");
        String reverse = input.next();
        input.close();
        
        int p = izenak.length - 1;
        if(reverse.equals("R") || reverse.equals("r")){
            for(int i = 0; i < izenak.length; i++){
                izenakReverse[i] = izenak[p];
                System.out.println((i + 1) + "- " + izenakReverse[i]);
                p--;
            }
        }
    }
}
