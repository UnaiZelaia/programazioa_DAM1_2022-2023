package model;

import java.util.ArrayList;

import javax.lang.model.util.ElementScanner6;

public class Selekzioa{
    private ArrayList<Kidea> kideak = new ArrayList<>();
    private Nongoa nongoa;

    public Selekzioa(Nongoa nongoa, ArrayList<Kidea> kideak){
        this.kideak = kideak;
        this.nongoa = nongoa;
    }

    public String[] getKideenIzenak(){
        String [] izenak = new String[this.kideak.size()];
        for(int i = 0; i < this.kideak.size(); i++){
            izenak[i] = kideak.get(i).izena;
        }
        return izenak;
    }


    public void kideakBistaratu(){
        int jasotakoak;
        System.out.println("SELEKZIOA: " + this.nongoa +" \n");
        System.out.println("====================\n");
        for(int i = 0; i < this.kideak.size(); i++){
            System.out.println(this.kideak.get(i).toString() + "\n");
        } 
        System.out.println("Kidea kopurua: " + kideak.size() + "   Jasotako golak: " );
    }

    public int kideBerria(Kidea kidea){
        return 0;
    }

    public int kideaEzabatu(int id){
        for(int i = 0; i < this.kideak.size(); i++){
            if(this.kideak.get(i).id == id){
                this.kideak.remove(i);
                return 1;
            }
        }
        return 0;
    }




}