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
public class Uso_escuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aula aula = new Aula();
        
        //Para que se muestren los resultados es necesario ejecutar 
        //hasta que las condiciones para que se puedan dar clases sean verdaderas
        if (aula.darClase()) {
            aula.mostrarAlumnos();
             System.out.println("Alumnos Aprobados");
        aula.calificacionesAlumnos();
            
        }
       
    }

    /*
     Queremos representar con programación orientada a objetos, un aula con estudiantes y un profesor.
     Tanto de los estudiantes como de los profesores necesitamos saber su nombre, edad y sexo. De los estudiantes, queremos saber también su calificación actual (entre 0 y 10)  y del profesor que materia da.
     Las materias disponibles son matemáticas, filosofía y física.
     Los estudiantes tendrán un 50% de hacer novillos, por lo que si hacen novillos no van a clase pero aunque no vayan quedara registrado en el aula (como que cada uno tiene su sitio).
     El profesor tiene un 20% de no encontrarse disponible (reuniones, baja, etc.)
     Las dos operaciones anteriores deben llamarse igual en Estudiante y Profesor (polimorfismo).
     El aula debe tener un identificador numérico, el número máximo de estudiantes y  para que esta destinada (matemáticas, filosofía o física). Piensa que más atributos necesita.
     Un aula para que se pueda dar clase necesita que el profesor esté disponible, que el profesor de la materia correspondiente en el aula correspondiente (un profesor de filosofía no 
     puede dar en un aula de matemáticas) y que haya más del 50% de alumnos.
     El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse clase, teniendo en cuenta las condiciones antes dichas.
     Si se puede dar clase mostrar cuantos alumnos y alumnas (por separado) están aprobados de momento (imaginad que les están entregando las notas).
     NOTA: Los datos pueden ser aleatorios (nombres, edad, calificaciones, etc.) siempre y cuando tengan sentido (edad no puede ser 80 en un estudiante o calificación ser 12).

     */
}
