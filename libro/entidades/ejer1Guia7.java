/*
 * Crear una clase llamada ejer1Guia7 que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, 
y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante 
otro método el número de ISBN, el título, el autor del libro y el número de páginas.

 */
package libro.entidades;

import java.util.Scanner;

public class ejer1Guia7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Libro libro1 = new Libro();

        System.out.println("Ingrese el ISBM del libro");
        libro1.isbm = leer.nextInt();
        System.out.println("...");
        System.out.println(" Ingrese el titulo del libro");
        libro1.titulo = leer.next();
        System.out.println("...");
        System.out.println("Ingrese la cantidad de paginas del libro");
        libro1.cantPag = leer.nextInt();
        System.out.println("...");
        System.out.println("Ingrese el nombre del autor del libro");
        libro1.autor = leer.next();

        System.out.println(libro1);
    }

}
