/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author ALFRED
 */
public class Profesor {
    private int dni;
    private String apellido;
    private String nombre;
    private String clave;
    private Cargo cargo;

    public Profesor(int dni, String apellido, String nombre, String clave, Cargo cargo) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.clave = clave;
        this.cargo = cargo;
    }
    
    
    

    public int verDni() {
        return dni;
    }

    
    public void asignarDni(int dni) {
        this.dni = dni;
    }

    
    public String verApellido() {
        return apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verCargo() {
        return cargo.toString();
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    public void mostrar(){
        System.out.println("DNI: "+ dni);
        System.out.println("Apellidos: "+ apellido);
        System.out.println("Nombres: "+ nombre);
        System.out.println("Clave: "+ clave);
        System.out.println("Cargo: "+ cargo);
    }
}
