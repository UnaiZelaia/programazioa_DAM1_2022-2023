package model;

import java.time.LocalDate;

public class Futbolaria extends Kidea {
    private int dorsala;

    public Futbolaria(int id, String izena, String abizena, String jaiotzedata, int dorsala){
        super(id, izena, abizena, jaiotzedata);
        this.dorsala = dorsala;
    }

    public int getDorsala() {
        return dorsala;
    }

    public void setDorsala(int dorsala) {
        this.dorsala = dorsala;
    }

    @Override
    public void entrenatu(){
        System.out.println(dorsala + " jokalaria entrenatzen dago.");
    }

    @Override
    public String toString() {
        return "Futbolaria => " + super.id + ", " + super.izena + " " + super.abizena+ ", " + (LocalDate.now().getYear() - super.jaiotzeData.getYear()) + " urte, " + this.getDorsala() + " dortsala";
    }


    
}
