import java.lang.Integer;
import java.lang.Math;
import java.util.Arrays;

public class Zatikia {
    int zenbakitzailea;
    int izendatzailea;

    public Zatikia(int zenba, int izen){
        this.zenbakitzailea = zenba;
        this.izendatzailea = izen;
    }

    public int getzenbakitzailea(){
        return this.zenbakitzailea;
    }

    public int getIzendatzailea(){
        return this.izendatzailea;
    }

    public void setzenbakitzailea(int zenba){
        this.zenbakitzailea = zenba;
    }

    public void setIzendatzailea(int izen){
        this.izendatzailea = izen;
    }

    public String toString(){
        return zenbakitzailea + "/" + izendatzailea;
    }

    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2){
        int totalZenbat = zat1.zenbakitzailea * zat2.zenbakitzailea;
        int totalIzen = zat1.izendatzailea * zat2.izendatzailea;
        Zatikia retZati = new Zatikia(totalZenbat, totalIzen);
        return retZati;
    }

    public static Zatikia batu(Zatikia zat1, Zatikia zat2){
        int totalZenba = zat1.zenbakitzailea + zat2.zenbakitzailea;
        int max;
        if(zat1.izendatzailea == zat2.izendatzailea){
            max = zat1.izendatzailea;
        }
        else{
            int a = 1;
            max = (zat1.izendatzailea > zat2.izendatzailea) ? zat1.izendatzailea : zat2.izendatzailea;
            while(a != 1){
                if(max % zat1.izendatzailea == 0 && max % zat1.izendatzailea == 0){
                    int multi1 = max / zat1.izendatzailea;
                    int multi2 = max / zat2.izendatzailea;
                    int totalZenba1 = zat1.zenbakitzailea * multi1;
                    int totalZenba2 = zat2.zenbakitzailea * multi2;
                    totalZenba = totalZenba1 + totalZenba2;
                    a = 1;
                    
                }
                max++;
            }
        }
        Zatikia retZati = new Zatikia(totalZenba, max);
        return retZati;
    }


    public void batu(Zatikia zat2){
        int totalZenba = this.zenbakitzailea + zat2.zenbakitzailea;
        int max;
        if(this.izendatzailea == zat2.izendatzailea){
            max = this.izendatzailea;
        }
        else{
            max = Zatikia.mkt(this.izendatzailea, zat2.izendatzailea);
            this.zenbakitzailea = (max / this.zenbakitzailea) * this.zenbakitzailea;
            zat2.zenbakitzailea = (max / zat2.zenbakitzailea) * zat2.zenbakitzailea;
        }
        this.zenbakitzailea = totalZenba;
        this.izendatzailea = max;
    }


    public double hamartarBaliokidea(){
        return (double)this.zenbakitzailea / (double)this.izendatzailea;
    }

    public boolean isBaliokidea(Zatikia zat){
        return this.hamartarBaliokidea() == zat.hamartarBaliokidea();
    }

    public boolean isBiggerThan(Zatikia zat){
        return this.hamartarBaliokidea() > zat.hamartarBaliokidea();
    }

    public Zatikia(String zatIdatzia){
        String zatia[] = zatIdatzia.split("/");

        this.zenbakitzailea = Integer.parseInt(zatia[0]);
        this.izendatzailea = Integer.parseInt(zatia[1]);
    }


    public Zatikia(){
        this.zenbakitzailea = ((int)(Math.random() * 10)) + 1;
        this.izendatzailea = ((int)(Math.random() * 10)) +1;
    }


    public void sinplifikatu(){
        int a = 0;
        int i = 2;
        while(a != 1){
            if(this.zenbakitzailea % i == 0 && this.izendatzailea % i == 0){
                this.zenbakitzailea = this.zenbakitzailea / i;
                this.izendatzailea = this.izendatzailea / i;
                i = 1;
            }
            if(i == this.zenbakitzailea || i == this.izendatzailea){
                a = 1;
            }
            i++;
        }
    }


    public static int mkt(int n1, int n2){
        int a = 0;
        int max = (n1 > n2) ? n1 : n2;
        while(a != 1){
            if(max % n1 == 0 && max % n2 == 0){
                a = 1;
            }
            max++;
        }
        return max;
    }


    public static int zkh(int n1, int n2){
        int low = (n1 > n2) ? n2 : n1;
        int zkh = 0;

        for(int i = low; n1 % i == 0 && n2 % i == 0; i--){
            zkh = i;
        }
        return zkh;
    }


    public static int[] faktorizatu(long n){
        int faktoreak[] = new int[100];
        int p = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                faktoreak[p] = i;
                n = n / i;
                p++;
                i = 2;
            }
        }
        return faktoreak;
    }

    public Zatikia[] zatikiakOrdenatu(Zatikia[] zatikiak){
        double handiena = 0.00;
        Zatikia[] zatikiakOrdenatuta;
        zatikiakOrdenatuta = new Zatikia[zatikiak.length];
        Arrays.sort(zatikiak);
        int p = zatikiak.length - 1;

        for(int i = 0; i <= zatikiak.length; i++){
            if(zatikiak[i].hamartarBaliokidea() < handiena){
                handiena = zatikiak[i].hamartarBaliokidea();
                zatikiakOrdenatuta[p] = zatikiak[i];
                p--;
                zatikiak[i] = new Zatikia(0, 0);
            }
        }
        return zatikiakOrdenatuta;
    }
}
