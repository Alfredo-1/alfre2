/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicacion.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author ALFRED
 */
public class Publicacion {
    private String titulo;
    private LocalDate fechaDePublicacion;
    private String enlace;
    private String resumen;
    private ArrayList<PalabraClave> palabrasClaves;
    private MiembroEnGrupo autor;
    private Tipo tipoPublicacion;
    private Idioma idiomaPublicacion;
    private Lugar lugarPublicacion;

    public Publicacion(String titulo, LocalDate fechaDePublicacion, String enlace, String resumen, ArrayList<PalabraClave> palabrasClaves, MiembroEnGrupo autor, Tipo tipoPublicacion, Idioma idiomaPublicacion, Lugar lugarPublicacion) {
        this.titulo = titulo;
        this.fechaDePublicacion = fechaDePublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
        this.palabrasClaves = palabrasClaves;
        this.autor = autor;
        this.tipoPublicacion = tipoPublicacion;
        this.idiomaPublicacion = idiomaPublicacion;
        this.lugarPublicacion = lugarPublicacion;
    }

    public Lugar verLugarPublicacion() {
        return lugarPublicacion;
    }

    public void asignarLugarPublicacion(Lugar lugarPublicacion) {
        this.lugarPublicacion = lugarPublicacion;
    }

    public String verTitulo() {
        return titulo;
    }

    public void asignarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate verFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void asignarFechaDePublicacion(LocalDate fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public String verEnlace() {
        return enlace;
    }

    public void asignarEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String verResumen() {
        return resumen;
    }

    public void asignarResumen(String resumen) {
        this.resumen = resumen;
    }

    public MiembroEnGrupo verAutor() {
        return autor;
    }

    public void asignarAutor(MiembroEnGrupo autor) {
        this.autor = autor;
    }

    public Tipo verTipoPublicacion() {
        return tipoPublicacion;
    }

    public void asignarTipoPublicacion(Tipo tipoPublicacion) {
        this.tipoPublicacion = tipoPublicacion;
    }

    public Idioma verIdiomaPublicacion() {
        return idiomaPublicacion;
    }

    public void verIdiomaPublicacion(Idioma idiomaPublicacion) {
        this.idiomaPublicacion = idiomaPublicacion;
    }
    
    public void verPalabrasClaves(){
        System.out.println("Palabras Claves: ");
        System.out.println("----------------");
        for(PalabraClave pClave: palabrasClaves){
            System.out.println("\t"+ pClave.toString());
        }
    }
    
    public void mostrar(){
        System.out.println("Titulo: "+ this.titulo);
        System.out.println("Autor: "+ this.autor.getProfesor().verApellido()+", "+this.autor.getProfesor().verNombre());
        System.out.println("Grupo: "+ this.autor.getGrupo().verNombre());
        System.out.println("Rol: "+ this.autor.getRol().toString());
        System.out.println("Fecha de publicacion: "+ this.fechaDePublicacion.getDayOfMonth()+ "/"+ this.fechaDePublicacion.getMonthValue()+"/"+ this.fechaDePublicacion.getYear());
        System.out.println("Tipo: "+ this.tipoPublicacion);
        System.out.println("Idioma: "+ this.idiomaPublicacion);
        System.out.println("Lugar: "+ this.lugarPublicacion);
        verPalabrasClaves();
        System.out.println("Enlaces: "+ this.enlace);
        System.out.println("Resumen: "+ this.resumen);
        System.out.println("\n");
    }
}
