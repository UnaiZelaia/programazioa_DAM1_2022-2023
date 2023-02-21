package model;

import java.time.LocalDate;

public class Entrenatzailea extends Kidea{
    private String idFederazioa;

    public Entrenatzailea(int id, String izena, String abizena, String jaiotzeData, String idFederazioa){
        super(id, izena, abizena, jaiotzeData);
        this.idFederazioa = idFederazioa;
    }

    public String getIdFederazioa() {
        return idFederazioa;
    }

    public void setIdFederazioa(String idFederazioa) {
        this.idFederazioa = idFederazioa;
    }


    @Override
    public void entrenatu(){
    }

    @Override
    public String toString() {
        return "Entrenatzailea => " + super.id + " " + super.izena + " " + super.abizena + ", " + (LocalDate.now().getYear() - super.jaiotzeData.getYear()) + " urte, " + this.idFederazioa;
    }

    
    
}
