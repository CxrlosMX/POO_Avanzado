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
public class Uso_empresa {

    public static void main(String args[]) {
        Comercial[] comercial = new Comercial[2];
        Repartidor[] repartidor = new Repartidor[2];

        comercial[0] = new Comercial(300, "Luis", 35, 1500);
        comercial[1] = new Comercial(100, "Carlos", 27, 500);
        repartidor[0] = new Repartidor("zona 1", "Maria", 20, 900);
        repartidor[1] = new Repartidor("zona 3", "Carmen", 30, 1800);

        for (Comercial c : comercial) {
            c.sueldoPlus();
            System.out.println(c); //No es necesario poner el toString java ya reconoce si tiene o no una cadena para mostrar

        }
        for (Repartidor e : repartidor) {
            e.sueldoPlus();
            System.out.println(e);
        }
    }

}
