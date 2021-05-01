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
public class Metodos {
    
    
    //Vamos a crear un metodo para crear numeros aleatorios 
    public static int generarNumerosAleatorios(int minimo, int maximo){
    int num=(int) Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    return num;
    
    }
    
}
