/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado 
al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y 
se devuelve el resultado al main.
 */
package operaciones.entidades;

import java.util.Scanner;

public class Operacion {

    private int numero;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int num, int num2) {
        this.numero = num;
        this.numero2 = num2;
    }

    public void setter(int num, int num2) {
        this.numero = num;
        this.numero2 = num2;

    }

    public int getNumero() {
        return numero;
    }

    public int getNumero2() {
        return numero2;
    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public double crearOperacion() {
        System.out.println(" Ingrese los  2 numeros para realizar la operacion");
        double num = leer.nextDouble();
        double num2 = leer.nextDouble();
        double result = 0;

        System.out.println("ingrese la operacion a realizar: S, R M,D");
        String op;
        op = leer.next();
        switch (op) {
            case "S":
                result = num + num2;
                break;
            case "R":
                result = num - num2;
                break;
            case "M":
                if (num2 != 0) {
                    result = num * num2;
                }
                break;
            case "D":
                if (num2 != 0) {
                    result = num / num2;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("ingrese una opcion correcta");
        }
        return result;

    }
}
