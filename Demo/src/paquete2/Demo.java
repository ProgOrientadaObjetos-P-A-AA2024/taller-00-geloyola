/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje;
import paquete3.Informacion;


/**
 *
 * @author reroes
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena1= Mensaje.obtenerMensaje(); 
        int habitantes= Informacion.obtenerHabitantes();
        // ingresar la ruta del paquete1 y finalizar con parentesis
        System.out.printf("%s\n con %d\n", cadena1, habitantes);
        // usar printf;
    }
    
}
