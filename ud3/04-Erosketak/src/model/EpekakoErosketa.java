package model;

public class EpekakoErosketa extends Erosketa {
    int epeak = 12;
    boolean ordainketaBukatuta = false;
    double kuota;


    public double gainetikOrdainduBeharrekoa(){
        double ordaindua = this.kuota * this.epeak;
        double ordainduBeharrekoa = super.guztira - ordaindua;
        return ordainduBeharrekoa;
    }


    public EpekakoErosketa(String kodea, Bezeroa eroslea, double guztira, double kuota){
        super(kodea, eroslea, guztira);
        this.kuota = kuota;
    }
}
