package model;

public class Futbolista extends IntegranteSeleccion{
    private int dorsal;
    public Demarcacion demarcacion;




    public Futbolista(){
        
    }

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, Demarcacion demar){
        super.id = id;
        super.nombre = nombre;
        super.setApellidos(apellido);
        super.setEdad(edad);
        this.dorsal = dorsal;
        this.demarcacion = demar;
    }


    public void entrenar(){
        System.out.println(super.nombre + " " + super.getApellidos() + "Está entrenando.");
    }

    public void jugarPartido(){
        System.out.println(super.nombre + " " + super.getApellidos() + "Está jugando el partido.");
    }

    public int getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}