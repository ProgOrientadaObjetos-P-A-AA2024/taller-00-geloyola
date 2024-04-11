/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje;
import paquete3.Informacion;
import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String cadena1= Mensaje.obtenerMensaje(); 
        int habitantes= Informacion.obtenerHabitantes();
        int opcion;
        String cadenaFinal= String.format("%s\n con %d\n", cadena1, habitantes);
        opcion= leer.nextInt();
       
        if (opcion<=5 && opcion>=1){
            System.out.printf("%s\n;", cadenaFinal);
        }
        else{
            System.out.printf("%s\n", cadenaFinal.toUpperCase() );
            
        }
        // ingresar la ruta del paquete1 y finalizar con parentesis
        
        // usar printf;
    }
    
}
