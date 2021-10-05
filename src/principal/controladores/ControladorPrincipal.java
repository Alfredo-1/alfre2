/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import idiomas.modelos.Idioma;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;


/**
 *
 * @author ALFRED
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        ArrayList<Grupo> Grupos = new ArrayList<Grupo>();
        ArrayList<Lugar> Lugares = new ArrayList<Lugar>();
        ArrayList<PalabraClave> PalabrasClaves = new ArrayList<PalabraClave>();
        ArrayList<Idioma> Idiomas = new ArrayList<Idioma>();
        ArrayList<Tipo> Tipos = new ArrayList<Tipo>();
        ArrayList<Alumno> Alumnos = new ArrayList<Alumno>();
        ArrayList<Profesor> Profesores = new ArrayList<Profesor>();
        
        //instanciar 5 objetos de cada clase y guardarlos en sus respectivos array
        Grupos.add(new Grupo ("G-12-C1", "Grupo 12 de Calculo 1"));
        Grupos.add(new Grupo ("G-16-C3", "Grupo 1 de Calculo 3"));
        Grupos.add(new Grupo ("G-5-F1", "Grupo 5 de Fisica 1"));
        Grupos.add(new Grupo ("G-2-P2", "Grupo 2 de Programacion 2"));
        Grupos.add(new Grupo ("G-3-E1", "Grupo 3 de Electronica 1"));
        
        Lugares.add(new Lugar ("aula"));
        Lugares.add(new Lugar ("Facultad"));
        Lugares.add(new Lugar ("Anfiteatro"));
        Lugares.add(new Lugar ("Libro"));
        Lugares.add(new Lugar ("Revista"));
        
        PalabrasClaves.add(new PalabraClave ("Cargo"));
        PalabrasClaves.add(new PalabraClave ("Entrada"));
        PalabrasClaves.add(new PalabraClave ("Alumno"));
        PalabrasClaves.add(new PalabraClave ("Salida"));
        PalabrasClaves.add(new PalabraClave ("Profesor"));
        
        Idiomas.add(new Idioma ("Ingles"));
        Idiomas.add(new Idioma ("Frances"));
        Idiomas.add(new Idioma ("Español"));
        Idiomas.add(new Idioma ("Ruso"));
        Idiomas.add(new Idioma ("Aleman"));
        
        Tipos.add(new Tipo("Libro"));
        Tipos.add(new Tipo("Trabajo"));
        Tipos.add(new Tipo("Estudio"));
        Tipos.add(new Tipo("Libro"));
        Tipos.add(new Tipo("Ejercicios"));
        
        Alumnos.add(new Alumno(40823391, "Soria", "Lucia", "luci1", "1312056"));
        Alumnos.add(new Alumno(40823391, "Paz", "Monica", "moni1230321", "1345056"));
        Alumnos.add(new Alumno(40823391, "Muñoz", "Matias", "yella", "1114056"));
        Alumnos.add(new Alumno(40823391, "Sancho", "German", "ger123", "1307756"));
        Alumnos.add(new Alumno(40823391, "zurita", "Alfredo", "al1997", "1344056"));
        
        Profesores.add(new Profesor(11765389, "Alcantara", "Secilia", "seci123", "Administrador"));
        Profesores.add(new Profesor(11765389, "Dias", "Monica", "monica1", "Administrador"));
        Profesores.add(new Profesor(11765389, "Sanches", "Oscar", "hola123", "Administrador"));
        Profesores.add(new Profesor(11765389, "Paz", "Laura", "lau321", "Administrador"));
        Profesores.add(new Profesor(11765389, "Condori", "Laura", "1233go", "Administrador"));
        
        System.out.println("---Lista de profesores---\n");
        for(Profesor unProfesor: Profesores){
            unProfesor.mostrar();
            System.out.println();
        }
        
        System.out.println("---Lista de Alumnos---\n");
        for(Alumno unAlumno: Alumnos){
            unAlumno.mostrar();
            System.out.println();
        }
        
        System.out.println("---Lista de Tipo---\n");
        for(Tipo unTipo: Tipos){
            unTipo.mostrar();
            System.out.println();
        }
        
        System.out.println("---Lista de palabras claves---\n");
        for(PalabraClave unaPalabraClave: PalabrasClaves){
            unaPalabraClave.mostrar();
            System.out.println();
        }
        
        System.out.println("---Lista de Grupos---\n");
        for(Grupo unGrupo: Grupos){
            unGrupo.mostrar();
            System.out.println();
        }
        
        System.out.println("---Lista de Idiomas---\n");
        for(Idioma unIdioma: Idiomas){
            unIdioma.mostrar();
            System.out.println();
        }
        
        System.out.println("---Lista de Lugares---\n");
        for(Lugar unLugar: Lugares){
            unLugar.mostrar();
            System.out.println();
        }
        
    }
}
