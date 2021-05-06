/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaEmpleados;

/**
 *
 * @author El Camaleon
 */
// No se podrán crear objetos del tipo Empleado, esto indica que la clase padre sera abstracta
public class Repartidor extends Empleado implements Constantes {

    //El repartidor, aparte de los atributos de empleado, tiene otro llamado zona (String).
    private String zona;

    public Repartidor(String zona, String nombre, int edad, double sueldoBase) {
        super(nombre, edad, sueldoBase); //Super manda a llamar al contructor de la clase padre
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    //En repartidor, si tiene menos de 25 y reparte en la “zona 3”, este recibirá el plus
    @Override //Polimorfismo
    public boolean sueldoPlus() {
        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("zona 3")) {
            super.setSueldoBase(super.getSueldoBase() + PLUS);
            System.out.println("Se le ha aumentado el sueldo al empleado "+super.getNombre());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", zona=" + zona;
    }

}
