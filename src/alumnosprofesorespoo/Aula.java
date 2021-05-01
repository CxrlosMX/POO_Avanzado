/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnosprofesorespoo;

/**
 *
 * @author El Camaleon
 */
public class Aula implements Materias {

    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;
    /*
     El aula debe tener un identificador numérico, el número máximo de estudiantes y  para que esta destinada (matemáticas, filosofía o física). Piensa que más atributos necesita.
     Un aula para que se pueda dar clase necesita que el profesor esté disponible, que el profesor de la materia correspondiente en el aula correspondiente (un profesor de filosofía no 
     puede dar en un aula de matemáticas) y que haya más del 50% de alumnos.
  
     */
    private final int MAX_ALUMNOS = 20;

    public Aula(int n) {
        id = 1;
        alumnos = new Alumno[n];
    }

    public Aula() {
        id = 1;
        profesor = new Profesor();

        alumnos = new Alumno[MAX_ALUMNOS];
        creaAlumno();
        this.materia = MATERIAS[Metodos.generarNumerosAleatorios(0, MATERIAS.length - 1)];

    }

    private void creaAlumno() {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();
        }

    }
    /*
     determinar si puede darse clase, teniendo en cuenta las condiciones antes dichas.
     Si se puede dar clase mostrar cuantos alumnos y alumnas (por separado) están aprobados de momento (imaginad que les están entregando las notas).

     */

    private boolean asistenciaAlumnos() {
        int c = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].isDisponible()) {
                c++;
            }
        }
        return c >= ((int) (MAX_ALUMNOS / 2)); //Sera verdadero si es mayor a 10
    }

    public boolean darClase() {
        if (!profesor.isDisponible()) {
            System.out.println("El profesor no se encuentra disponible");
            return false;
        } else if (!profesor.getMateria().equalsIgnoreCase(materia)) {
            System.out.println("La materia del profesor y el aula no es la misma");
            return false;
        } else if (!asistenciaAlumnos()) {
            System.out.println("Mas del 50% de los alumnos no se presentaron en clases");
            return false;
        }
        System.out.println("Se puede dar clases");
        return true;
    }

    public void mostrarAlumnos() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Calificacion ;" + i + 1 + " " + alumnos[i].toString());
        }
    }

    //Mostrar Alumnos aprovador y reprobados
    public void calificacionesAlumnos() {
        int apro = 0;

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getCalificacion() > 5) {
                System.out.println("Alumno Aprobado: " + alumnos[i].getNombre());
                apro++;
            }
        }
        System.out.println("Alumnos Aprovados: "+apro);
        System.out.println("Alumnos Reprobados: "+(alumnos.length-apro));
    }
}
