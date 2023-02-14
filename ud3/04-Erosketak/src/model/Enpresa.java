package model;

public class Enpresa extends Bezeroa {
    String izenJuridikoa;
    String izenKomertziala;
    String[] kontaktoenEmailak;

    @Override
    public String getIzena(){
        return this.izenJuridikoa;
    }

    @Override
    public String getEmaila(){
        String emailak = "";
        for(int i = 0; i < kontaktoenEmailak.length; i++){
            emailak = emailak + kontaktoenEmailak;
            if(i != kontaktoenEmailak.length - 1){
                emailak = emailak + ", ";
            }
        }
        return emailak;
    }
}
