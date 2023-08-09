package Punto1;

import java.util.ArrayList;

public class SistemaAlumnos {
    ArrayList<Alumno> alumnos;

    public SistemaAlumnos(){
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
        System.out.println("El alumno con nombre " + alumno.getNombre() + " fue agregado correctamente.");
    }
    public void asignarCalificacion(Alumno alumno, Float calificacion){
        alumno.getCalificaciones().add(calificacion);
        System.out.println("La calificación " + calificacion + " se ha agregado correctamente.");
    }
    public void calcularPromedio(Alumno alumno){
        float suma = 0;
        for (float calificacion: alumno.getCalificaciones()){
            suma += calificacion;
        }
        float promedio = suma / alumno.getCalificaciones().size();
        double promedioRedondeado = Math.round(promedio * 10.0) / 10.0;
        System.out.println("El promedio del alumno " + alumno.getNombre() + " es: " + promedioRedondeado);
    }
    public void mostrarInformacion(Alumno alumno){
        System.out.println("Información detallada del alumno: ");
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Calificaciones: " + alumno.getCalificaciones());
    }
    public void listarAlumnos(){
        for (Alumno alumno: alumnos){
            mostrarInformacion(alumno);
        }
    }
}
