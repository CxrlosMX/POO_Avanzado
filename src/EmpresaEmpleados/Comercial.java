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
public class Comercial extends Empleado implements Constantes {

    //El comercial, aparte de los atributos anteriores, tiene uno más llamado comisión (double). 
    private double comision;

    public Comercial(double comision, String nombre, int edad, double sueldoBase) {
        super(nombre, edad, sueldoBase);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    // • En comercial, si tiene más de 30 años y cobra una comisión de más de 200 euros, se le aplicara el plus.
    @Override
    public boolean sueldoPlus() {
        /*  return super.getEdad() > 30 && this.comision > 200; 
         //Esta condicion si se cumple devolvera un true*/
        if (super.getEdad() > 30 && this.comision > 200) {
            double sF = super.getSueldoBase() + PLUS; //Asignamos un valor a nuestro salario
            super.setSueldoBase(sF);
            System.out.println("Se le ha aumentado el sueldo al empleado " + super.getNombre());

            return true;

        }
        return false;
    }
  

    @Override
    public String toString() {
        return super.toString() + ", comision=" + comision;
    }

}
