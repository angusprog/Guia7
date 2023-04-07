/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distancia;

import java.util.Scanner;

/**
 *
 * @author claud
 */

    
public class Punto {
    
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Punto() {
    }
    
 public void crearPuntos(){
 Scanner leer= new Scanner(System.in);
 double d;
     System.out.println("ingrese las coordenadas  del punto 1");
     x1=leer.nextInt();
     y1=leer.nextInt();
     System.out.println("Ingrese las coordenadas del punto 2");
     x2=leer.nextInt();
     y2=leer.nextInt();
     
 }
 public double calcular(){
 
    double d=Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)));
    return d;
}
  
 }
