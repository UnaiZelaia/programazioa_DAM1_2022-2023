package model;

public class Pertsona extends Bezeroa {
    String izena;
    String abizena;
    String emaila;

    @Override
    public String getIzena(){
        return this.izena;
    }

    @Override
    public String getEmaila(){
        return this.emaila;
    }
}
