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
public  abstract class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private boolean disponible;
    //Contstantes
  
    //Vamos a crear un arreglo para los nombres de los jugadores
    private final String[] NOMBRES_ALUMNOS = {"Antonio", "Luis", "Carlos", "Manuel", "Jose", "Fernando"};
    private final String[] NOMBRES_ALUMNAS = {"Nadia", "Danna", "Noelia", "Alejandra", "Shel", "Fanny"};

    public Persona() {
        int determinarSexo = Metodos.generarNumerosAleatorios(0, 1);
        if (determinarSexo == 0) {
            //Asignar un nombre aleatorio a Mujer
            this.nombre = NOMBRES_ALUMNAS[Metodos.generarNumerosAleatorios(0, NOMBRES_ALUMNOS.length - 1)];
            sexo = "Femenimo";
        } else {
            this.nombre = NOMBRES_ALUMNOS[Metodos.generarNumerosAleatorios(0, NOMBRES_ALUMNOS.length - 1)];
            sexo = "Masculino";
        }

     nodisponible();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    //Con este metodo estamos diciendo que afuerza use el metodo disponibilidad
    public abstract void nodisponible();

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo;
    }

}
