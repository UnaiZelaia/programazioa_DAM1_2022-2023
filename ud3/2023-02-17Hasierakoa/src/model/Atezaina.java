package model;

import java.time.LocalDate;

public class Atezaina extends Futbolaria {
    public int geratutakoBaloiak = 0;
    public int jasotakoGolak = 0;


    public Atezaina(int id, String izena, String abizena, String jaiotzeData, int dortsala){
        super(id, izena, abizena, jaiotzeData, dortsala);
    }

    public Atezaina(int id, String izena, String abizena, String jaiotzeData, int dortsala, int geratutakoBaloiak, int jasotakoGolak){
        super(id, izena, abizena, jaiotzeData, dortsala);
        this.geratutakoBaloiak = geratutakoBaloiak;
        this.jasotakoGolak = jasotakoGolak;
    }

    public int getGeratutakoBaloiak() {
        return geratutakoBaloiak;
    }

    public int getJasotakoGolak() {
        return jasotakoGolak;
    }

    public void baloiaGeratu(){
        geratutakoBaloiak += 1;
    }

    public void golaJaso(){
        jasotakoGolak += 1;
    }

    @Override
    public String toString() {
        return "Atezaina => " + super.id + ", " + super.izena + " " + super.abizena+ ", " + (LocalDate.now().getYear() - super.jaiotzeData.getYear()) + " urte, " + super.getDorsala() + " dortsala, " + this.geratutakoBaloiak + " geratuak, " + this.jasotakoGolak + " jasoak";
    }

    
    
}
