/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import java.util.Scanner;

/**
 *
 * @author Javier Alejandro Aguilar Baez
 * @version 1.0
 * 
 */
public class Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { /** metodoprncipal que despliega menu*/    
        String respuesta = "";
        String respuesta2= "";
        Scanner leer = new Scanner(System.in);  
        
        System.out.println("seleccione que tipo de carro desea generar");  
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("A - Carro con gasolina");
        System.out.println("B - carro sin gasolina");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
       respuesta = leer.next();
        
        if(respuesta.equalsIgnoreCase("a")){
             System.out.println("carro creado");
            carro carro1 = new carro(50); /** construccion del objeto de la clase carro utilzando constructor sobreescrito para asi tener gasolina desde que se inicia el objeto*/  
            System.out.println("¿desea recargar gasolina?");
            respuesta2 = leer.next();
            if(respuesta2.equalsIgnoreCase("si")){
                carro1.recargargasolina();
            }
            else{
                System.out.println("de acuerdo");
            }
                    
            
            
        }
        else{
           
             respuesta = leer.next();
        }
        if (respuesta.equalsIgnoreCase("b")){
            System.out.println("carro creado");
             carro carro1 = new carro(); /** construccion del objeto de la clase carro utilizando constructor por defecto*/  
            System.out.println("¿desea recargar gasolina?");
            respuesta2 = leer.next();
            if(respuesta2.equalsIgnoreCase("si")){
                carro1.recargargasolina();
            }
            else{
                System.out.println("de acuerdo");
            }
        }
        else{
            
             respuesta = leer.next();
        }
        
        
        
        
        
    }
    
}
