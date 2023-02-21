package model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Kidea {
    protected int id;
    protected String izena;
    protected String abizena;
    protected LocalDate jaiotzeData = LocalDate.of(1900, 01, 01);


    public Kidea(int id, String izena, String abizena, String jaiotzeData){
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            this.jaiotzeData = LocalDate.parse(jaiotzeData, formatter1);
        } catch (Exception e) {
            System.out.println(this.abizena + " kideanren data ezin izan da parseatu.");
        }
    }


    public abstract void entrenatu();


    @Override
    public String toString() {
        return "Kidea [id=" + id + ", izena=" + izena + ", abizena=" + abizena + ", jaiotzeData=" + jaiotzeData + "]";
    }
};
