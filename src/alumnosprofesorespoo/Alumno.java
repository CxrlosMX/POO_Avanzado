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
public class Alumno extends Persona {

    private int calificacion;

    public Alumno() {
        super();
        super.setEdad(Metodos.generarNumerosAleatorios(12, 20)); //Con este metodo estamos asignandole una edad aleatoria
        this.calificacion = Metodos.generarNumerosAleatorios(0, 10);
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    //Metodo para verificar si el alumno esta disponible
    @Override
    public void nodisponible() {
        int pro = Metodos.generarNumerosAleatorios(0, 100);
      
        // return pro < 50; //Si sale menor a 50 es por que no va a ir a clases 
        if(pro<50){
        super.setDisponible(false); //No esta disponible
        }
        else {
        super.setDisponible(true); //Esta disponible
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", calificacion=" + calificacion;
    }

}
