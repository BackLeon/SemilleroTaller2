import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaAlumnos {


    List<Alumno> misAlumnos = new ArrayList<Alumno>();

    public void agregarNotas(int iddelestudiante){
        Scanner notasestudiante = new Scanner(System.in);
        System.out.println("Introduce las notas de tu estudiante, son 5 en total: ");
        double total = 0;
        int indiceEstudiante = iddelestudiante - 1;
        
        
        Alumno mirar =  misAlumnos.get(indiceEstudiante);

        for(int iterador = 1; iterador <=5; iterador++){
            System.out.println("Nota " + iterador + ": ");
            double not = notasestudiante.nextDouble();
            mirar.misnotas.add(not);
            
        }

        for (Double nota : mirar.misnotas) {

            total += nota;           
        }

        mirar.setCalificacion(total / 5);

        System.out.println("Se agregaron con exito las notas de " + mirar.getNombre());
        
    }



    public void agregarEstudiantes(int totalestudiantes){

        System.out.println("Decidiste agregar " + totalestudiantes + " estudiantes al sistema.");

        
        Scanner informacion = new Scanner(System.in);

        for(int interador = 1; interador <= totalestudiantes; interador++){

            System.out.println("Agrega los datos de tu alumno numero " + interador);
            System.out.println("Nombre: ");
            String suNombre = informacion.next();
            System.out.println("Edad: ");
            int suEdad = informacion.nextInt();
            Alumno miAlumno = new Alumno(suNombre, suEdad);
            misAlumnos.add(miAlumno);
            System.out.println("Alumno creado con exito.");
        }
    }

    public void verTodosLosEstudiantes(){

        
        for (Alumno estudiante : misAlumnos ) {
            
            estudiante.info();

        }


    }

    
}
