/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cancion;

import java.util.Scanner;
/**
 *
 * @author claud
 */
public class Cancion {


    
    
   private String titulo;
   private String autor; 

   public Cancion() {
       
    }
   public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
   public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
   
    public void cancion(){
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese titulo");
        this.titulo=leer.nextLine();
        System.out.println("Ingrese el autor");
        this.autor=leer.nextLine();
        
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    }

