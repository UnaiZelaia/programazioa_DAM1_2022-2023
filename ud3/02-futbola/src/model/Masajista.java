package model;

public class Masajista extends IntegranteSeleccion{
    private String titulacion;
    private int añosExperiencia;



    public Masajista(){
        
    }

    public Masajista(int id, String nombre, String apellido, int edad, String tit, int exp){
        super.id = id;
        super.nombre = nombre;
        super.setApellidos(apellido);
        super.setEdad(edad);
        this.titulacion = tit;
        this.añosExperiencia = exp;
    }



    public void darMasaje(){
        System.out.println(super.nombre + " " + super.getApellidos() + "Está dando un masaje");
    }




    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
}
