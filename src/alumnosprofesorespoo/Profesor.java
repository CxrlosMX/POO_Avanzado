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
// Las materias disponibles son matemáticas, filosofía y física.
public class Profesor extends Persona implements Materias{

    String materia;
    

    public Profesor() {
        super();
        super.setEdad(Metodos.generarNumerosAleatorios(25, 45));
        this.materia=MATERIAS[Metodos.generarNumerosAleatorios(0, MATERIAS.length-1)];
        //Con este metodo estamos asigandole una materia aleatoria
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
        @Override
    public void nodisponible() {
        int pro = Metodos.generarNumerosAleatorios(0,20);
      
        // return pro < 50; //Si sale menor a 50 es por que no va a ir a clases 
        if(pro<20){
        super.setDisponible(false); //No esta disponible
        }
        else {
        super.setDisponible(true); //Esta disponible
        }
    }

    @Override
    public String toString() {
        return ", Materia=" + materia ;
    }
    

}
