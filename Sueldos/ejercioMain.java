/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sueldos;



import java.util.Scanner;

/**
 *
 * @author claud
 */
public class ejercioMain {

    public static void main(String[] args) {
        

    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Nombre:");
        String nom = leer.nextLine();  
        
        System.out.println("Edad:");
        int edad = leer.nextInt();
        
        System.out.println("Sueldo:");
        double sueldo = leer.nextDouble();
       
      Empleado emple = new Empleado(nom, edad, sueldo);
      emple.calcular_aumento();
     

       
}}



   
    

