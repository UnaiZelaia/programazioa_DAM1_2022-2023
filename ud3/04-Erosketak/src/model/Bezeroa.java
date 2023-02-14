package model;

public abstract class Bezeroa{
    int kodea;
    String helbidea;


    public int getKodea() {
        return kodea;
    }

    public String getHelbidea() {
        return helbidea;
    }

    abstract public String getIzena();

    abstract public String getEmaila();
}