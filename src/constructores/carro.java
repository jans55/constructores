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
 */
public class carro {
    
    public carro(){ /**constructor por default*/  
        
    }
    public carro(int cantgas){ /**constructor sobrecargado utilixado para llenar gasolina desde que se crea el objeto*/  
        this.gasolina=cantgas; 
        
        
    }
    int gasolina=0;
    
    public void recargargasolina(){ /**metodo para recargar gasolina en el carro, si el carro ya tiene gasolina no se recarga*/  
        if(gasolina>0){
            System.out.println("el carro ya tiene gasolina");
        }
        else{
            gasolina=gasolina+50;
            System.out.println("su carro ahora tiene "+gasolina+" de gasolina");
        }
        
    }

    
    
    
    
    
}
