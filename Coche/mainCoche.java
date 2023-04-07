/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche;

/**
 *
 * @author claud
 */
public class mainCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Coche coche1 = new Coche("Toyota", "Corolla", 25000.00);
        Coche coche2 = new Coche("Renault", "Captur", 18000.00);
        Coche coche3 = new Coche("Ford", "Fiesta", 20000.00);
       
        System.out.println("1. Marca: " + coche1.getMarca() + ", modelo: " + coche1.getModelo() + ", precio: " + coche1.getPrecio());
        System.out.println("2. Marca: " + coche2.getMarca() + ", modelo: " + coche2.getModelo() + ", precio: " + coche2.getPrecio());
        System.out.println("3. Marca: " + coche3.getMarca() + ", modelo: " + coche3.getModelo() + ", precio: " + coche3.getPrecio());
    }
}

    
    

