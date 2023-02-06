package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Partida {
    private LocalDate data;
    private String aurkaria;
    private ArrayList<Futbolista> jokalariak;



    public void txartelaJarri(Futbolista f){
        System.out.println(f.nombre + " " + f.getApellidos() + "recibe una tarjeta.");
    }






    public String getAurkaria() {
        return aurkaria;
    }
    public LocalDate getData() {
        return data;
    }
    public ArrayList<Futbolista> getJokalariak() {
        return jokalariak;
    }

    public void setAurkaria(String aurkaria) {
        this.aurkaria = aurkaria;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setJokalariak(ArrayList<Futbolista> jokalariak) {
        this.jokalariak = jokalariak;
    }
}
