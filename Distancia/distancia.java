/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distancia;

/**
 *
 * @author claud
 */
public class distancia {

    /**
     * @param args the command line arguments
     */
    
      public static void main(String[] args) {
        // TODO code application logic here
        Punto p= new Punto();
        p.crearPuntos();
        double distancia = p.calcular();
        System.out.println("la distancia es "+distancia);
        
         
    }
        
    }
    
    

