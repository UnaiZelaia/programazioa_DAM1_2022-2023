package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Erosketa {
    char[] kodea;
    LocalDate data;
    Bezeroa bezeroa;
    ArrayList<Produktua> produktuak;
    ArrayList<Integer> unitateak;
    double guztira;


    private String getStrKodea(){
        String kodeaStr = "";
        for(int i = 0; i < kodea.length; i++){
            kodeaStr += kodea[i];
        }
        return kodeaStr;
    }

    @Override
    public String toString() {
        return "Erosketa [kodea=" + getStrKodea() + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak="
                + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + "]";
    }

    public Erosketa(String kodea, Bezeroa bezeroa, double guztira){
        this.kodea = kodea.toCharArray();
        this.bezeroa = bezeroa;
        this.guztira = guztira;
        this.data = LocalDate.now();
    }

    public Erosketa(String kodea, Bezeroa bezeroa, double guztira, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak){
        this.kodea = kodea.toCharArray();
        this.bezeroa = bezeroa;
        this.guztira = guztira;
        this.data = LocalDate.now();
        this.produktuak = produktuak;
        this.unitateak = unitateak;
    }
    
}
