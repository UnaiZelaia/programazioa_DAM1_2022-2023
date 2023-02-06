package model;

public class Entrenador extends IntegranteSeleccion{
    private String idFederacion;



    public Entrenador(){
        
    }

    public Entrenador(int id, String nombre, String apellido, int edad, String idFed){
        super.id = id;
        super.nombre = nombre;
        super.setApellidos(apellido);
        super.setEdad(edad);
        this.idFederacion = idFed;
    }

    

    public void dirigirEntrenamiento(){
        System.out.println(super.nombre + " " + super.getApellidos() + "Está dirigiendo el entrenamiento.");
    }

    public void dirigirPartido(){
        System.out.println(super.nombre + " " + super.getApellidos() + "Está dirigiendo el partido.");
    }





    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
}
