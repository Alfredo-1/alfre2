/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import autores.vistas.VentanaAMAlumno;
//import autores.vistas.VentanaAMProfesor;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import grupos.vistas.VentanaAMGrupo;
import idiomas.modelos.Idioma;
import idiomas.vistas.VentanaAIdioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import lugares.modelos.Lugar;
import lugares.vistas.VentanaALugar;
import palabrasclaves.modelos.PalabraClave;
import palabrasclaves.vistas.VentanaAPalabraClave;
import publicacion.modelos.Publicacion;
import tipos.modelos.Tipo;
import tipos.vistas.VentanaATipo;


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
        ArrayList<Publicacion> Publicaciones = new ArrayList<Publicacion>();
        //instanciar 5 objetos de cada clase y guardarlos en sus respectivos array, y luego mostrarlos
        
        //Creo 5 objetos del tipo grupo 
        Grupo grupo1 = new Grupo ("G-12-C1", "Grupo 12 de Calculo 1");
        Grupo grupo2 = new Grupo ("G-16-C3", "Grupo 1 de Calculo 3");
        Grupo grupo3 = new Grupo ("G-5-F1", "Grupo 5 de Fisica 1");
        Grupo grupo4 = new Grupo ("G-2-P2", "Grupo 2 de Programacion 2");
        Grupo grupo5 = new Grupo ("G-3-E1", "Grupo 3 de Electronica 1");
        //los guardo en su ArrayList       
        Grupos.add(grupo1);
        Grupos.add(grupo2);
        Grupos.add(grupo3);
        Grupos.add(grupo4);
        Grupos.add(grupo5);
        //muestra los grupos guardados en su arraylist
        System.out.println("---Lista de Grupos---\n");
        for(Grupo unGrupo: Grupos){
            unGrupo.mostrar();
            System.out.println();
        }
        
        //Crea los objetos del tipo lugar
        Lugar lugar1 = new Lugar ("aula");
        Lugar lugar2 = new Lugar ("Facultad");
        Lugar lugar3 = new Lugar ("Anfiteatro");
        Lugar lugar4 = new Lugar ("Libro");
        Lugar lugar5 = new Lugar ("Revista");
        //los agrega al arraylist
        Lugares.add(lugar1);
        Lugares.add(lugar2);
        Lugares.add(lugar3);
        Lugares.add(lugar4);
        Lugares.add(lugar5);
        //recorre y muestra lo del arraylist
        System.out.println("---Lista de Lugares---\n");
        for(Lugar unLugar: Lugares){
            System.out.println(unLugar);
        }
        
        //crea los objetos tipo palabraClave
        PalabraClave palabraClave1 = new PalabraClave ("palabra clave1");
        PalabraClave palabraClave2 = new PalabraClave ("palabra clave2");
        PalabraClave palabraClave3 = new PalabraClave ("palabra clave3");
        PalabraClave palabraClave4 = new PalabraClave ("palabra clave4");
        PalabraClave palabraClave5 = new PalabraClave ("palabra clave5");
        //los agrega al arraylist
        PalabrasClaves.add(palabraClave1);
        PalabrasClaves.add(palabraClave2);
        PalabrasClaves.add(palabraClave3);
        PalabrasClaves.add(palabraClave4);
        PalabrasClaves.add(palabraClave5);
        //los muestra
        System.out.println("---Lista de palabras claves---\n");
        for(PalabraClave unaPalabraClave: PalabrasClaves){
            System.out.println(unaPalabraClave);
        }
        
        //crea los objetos tipo idioma
        Idioma idioma1 = new Idioma ("Ingles");
        Idioma idioma2 = new Idioma ("Frances");
        Idioma idioma3 = new Idioma ("Español");
        Idioma idioma4 = new Idioma ("Ruso");
        Idioma idioma5 = new Idioma ("Aleman");
        //los guarda en el arraylist
        Idiomas.add(idioma1);
        Idiomas.add(idioma2);
        Idiomas.add(idioma3);
        Idiomas.add(idioma4);
        Idiomas.add(idioma5);
        //los muestra
        System.out.println("---Lista de Idiomas---\n");
        for(Idioma unIdioma: Idiomas){
            System.out.println(unIdioma);
        }
        
        //crea los objtos tipo Tipo
        Tipo tipo1 = new Tipo("Libro");
        Tipo tipo2 = new Tipo("Trabajo");
        Tipo tipo3 = new Tipo("Estudio");
        Tipo tipo4 = new Tipo("Libro");
        Tipo tipo5 = new Tipo("Ejercicios");
        //los agraga al arraylist
        Tipos.add(tipo1);
        Tipos.add(tipo2);
        Tipos.add(tipo3);
        Tipos.add(tipo4);
        Tipos.add(tipo5);
        //los muestra
        System.out.println("---Lista de Tipo---\n");
        for(Tipo unTipo: Tipos){
            System.out.println(unTipo);
        }
        
        //crea los objetos tipo Alumno
        Alumno alumno1 = new Alumno(40823391, "Soria", "Lucia", "luci1", "1312056");
        Alumno alumno2 = new Alumno(40823391, "Paz", "Monica", "moni1230321", "1345056");
        Alumno alumno3 = new Alumno(40823391, "Muñoz", "Matias", "yella", "1114056");
        Alumno alumno4 = new Alumno(40823391, "Sancho", "German", "ger123", "1307756");
        Alumno alumno5 = new Alumno(40823391, "zurita", "Alfredo", "al1997", "1344056");
        //los agrega al arraylist
        Alumnos.add(alumno1);
        Alumnos.add(alumno2);
        Alumnos.add(alumno3);
        Alumnos.add(alumno4);
        Alumnos.add(alumno5);
        //los muestra
        System.out.println("---Lista de Alumnos---\n");
        for(Alumno unAlumno: Alumnos){
            unAlumno.mostrar();
            System.out.println();
        }
        
        //crea los objetos tipo profesor
        Profesor profesor1 = new Profesor(11765389, "Alcantara", "Secilia", "seci123", Cargo.ASOCIADO);
        Profesor profesor2 = new Profesor(11765389, "Dias", "Monica", "monica1", Cargo.ADJUNTO);
        Profesor profesor3 = new Profesor(11765389, "Sanches", "Oscar", "hola123", Cargo.TITULAR);
        Profesor profesor4 = new Profesor(11765389, "Paz", "Laura", "lau321", Cargo.ADG);
        Profesor profesor5 = new Profesor(11765389, "Condori", "Laura", "1233go", Cargo.JTP);
        //los agrega al arraylist
        Profesores.add(profesor1);
        Profesores.add(profesor2);
        Profesores.add(profesor3);
        Profesores.add(profesor4);
        Profesores.add(profesor5);
        //los muestra
        System.out.println("---Lista de profesores---\n");
        for(Profesor unProfesor: Profesores){
            unProfesor.mostrar();
            System.out.println();
        }
        
        //crea los objetos tipo Publicacion
        Publicacion publicacion1 = new Publicacion("Titulo 1",LocalDate.of(2020, 6, 21),"Enlace 1","Resumen 1",new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1, palabraClave5, palabraClave3})),new MiembroEnGrupo(profesor1, grupo1, Rol.ADMINISTRADOR),tipo1,idioma1,lugar1);
        Publicacion publicacion2 = new Publicacion("Titulo 2",LocalDate.of(2020, 4, 24),"Enlace 2","Resumen 2",new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave2, palabraClave3, palabraClave3})),new MiembroEnGrupo(profesor3, grupo2, Rol.COLABORADOR),tipo2,idioma3,lugar2);
        Publicacion publicacion3 = new Publicacion("Titulo 3",LocalDate.of(2020, 6, 22),"Enlace 3","Resumen 3",new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave3, palabraClave4, palabraClave3})),new MiembroEnGrupo(profesor2, grupo3, Rol.COLABORADOR),tipo4,idioma5,lugar3);
        Publicacion publicacion4 = new Publicacion("Titulo 4",LocalDate.of(2020, 2, 26),"Enlace 4","Resumen 4",new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave4, palabraClave2, palabraClave3})),new MiembroEnGrupo(profesor5, grupo4, Rol.ADMINISTRADOR),tipo5,idioma2,lugar5);
        Publicacion publicacion5 = new Publicacion("Titulo 5",LocalDate.of(2020, 7, 21),"Enlace 5","Resumen 5",new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave5, palabraClave1, palabraClave3})),new MiembroEnGrupo(profesor4, grupo5, Rol.ADMINISTRADOR),tipo3,idioma2,lugar1);
        
        Publicaciones.add(publicacion1);
        Publicaciones.add(publicacion2);
        Publicaciones.add(publicacion3);
        Publicaciones.add(publicacion4);
        Publicaciones.add(publicacion5);
        System.out.println("\n---Lista de publicaciones---\n");
        for(Publicacion unaPublicacion: Publicaciones){
            unaPublicacion.mostrar();
        }
        
        
        
        
        
        
        
        
        
        
        
    }
//    public static void main(String[] args) {
//        VentanaAMAlumno ventanaAlumnos = new VentanaAMAlumno(null);//instancia la ventana alumnos
//        ventanaAlumnos.setVisible(true);//hace visible la ventana alumno
//        
////        VentanaAMProfesor ventanaProfesor = new VentanaAMProfesor (null);//instancia la ventana profesor
////        ventanaProfesor.setVisible(true);//muestra la ventana profesor
//        
//        VentanaAMGrupo ventanaGrupos = new  VentanaAMGrupo(null);
//        ventanaGrupos.setVisible(true);
//        
//        VentanaAIdioma ventanaIdiomas = new VentanaAIdioma(null);
//        ventanaIdiomas.setVisible(true);
//        
//        VentanaALugar ventanaLugar = new VentanaALugar(null);
//        ventanaLugar.setVisible(true);
//        
//        VentanaAPalabraClave ventanaPalabrasClaves = new VentanaAPalabraClave(null);
//        ventanaPalabrasClaves.setVisible(true);
//        
//        VentanaATipo ventanaTipos = new VentanaATipo(null);
//        ventanaTipos.setVisible(true);
//    }
    
    
}