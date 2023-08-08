import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {

    private static int iD;
    private int idEstudiante;
    private String nombre;
    private int edad;
    private double calificaciones;
    List<Double> misnotas = new ArrayList<Double>(5);

    public String getNombre(){

        return this.nombre;

    }

    public void setCalificacion(double total){

        this.calificaciones = total;

    }
    
    public Alumno(String nombre, int edad){

        iD++;

        this.idEstudiante = iD;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void info(){

        System.out.println(idEstudiante + "--Hola soy el estudiante " + nombre + " tengo " + edad + " años y mi calificacion es " + calificaciones);

    }

    
}
