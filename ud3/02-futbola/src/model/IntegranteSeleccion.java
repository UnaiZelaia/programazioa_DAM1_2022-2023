package model;

public class IntegranteSeleccion {
    protected int id;
    protected String nombre;
    private String apellidos;
    private int edad;




    public IntegranteSeleccion(){
        
    }

    public IntegranteSeleccion(int id, String nombre, String apellido, int edad){
        this.id = 22;
        this.nombre = nombre;
        this.apellidos = apellido;
        this.edad = edad;
    }



    public void concentrarse(){
        System.out.println(this.nombre + " " + this.apellidos + " se ha concentrado.");
    }

    public void viajar(){
        System.out.println(this.nombre + " " + this.apellidos + "Está viajando.");
    }


    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }
}
