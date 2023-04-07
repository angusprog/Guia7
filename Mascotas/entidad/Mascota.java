/*
 *3) Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
Crea un constructor para inicializar los valores de las propiedades y un método para mostrar por pantalla 
la información de la mascota.
Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
 */
package Mascotas.entidad;

import java.util.Date;

public class Mascota {

    private String nombre;
    private String edad;
    private String raza;
    private String tipo;
     private Date nacimiento;

    public Mascota(String nombre, String edad, String raza, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
    }

    public Mascota() {
    }

    public String cargarDatos() {
        System.out.println("ingrese los datos de la mascota: nombre, edad, raza y tipo");

        return
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", tipo=" + tipo + '}';
    }

}
