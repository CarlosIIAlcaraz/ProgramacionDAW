package com.company;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Persona(){ //Constructor Vacio
    }

    public int getEdad() { //GETTERS Y SETTERS
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean esAdolescente(){
        if (this.edad > 12 && this.edad < 20) {
                return true;
            }
            else {
                return false;
            }
    }

    public String getFullName(){
        if (this.nombre.isEmpty() && this.apellido.isEmpty()){
            return "";
        }
        else if
            (this.nombre.isEmpty() || this.apellido.isEmpty()){
                return this.apellido+this.nombre;
            }
        else {
            return this.nombre + " " + this.apellido;
        }
    }

}


