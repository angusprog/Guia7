/*
 *Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package circunferencia.entidades;

import java.util.Scanner;

public class ejercicio2 {

    

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el valor del radio");
        Circunferencia c1 = new Circunferencia(leer.nextDouble());
        System.out.println("el valor del area es : " + c1.area());
        System.out.println("el valor del perimetro es : " + c1.perimetro());
        c1.setter(8);
        System.out.println("el valor del area es : " + c1.area());
        System.out.println("el valor del perimetro es : " + c1.perimetro());
        
    }

}
