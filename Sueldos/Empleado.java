package Sueldos;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {

    }

    public Empleado(String nombreA, int edadA, double salarioA) {
        this.nombre = nombreA;
        this.edad = edadA;
        this.salario = salarioA;
    }

    public void setNombre(String nombreA) {
        this.nombre = nombreA;
    }

    public void setEdad(int edadA) {
        this.edad = edadA;
    }

    public void setSalario(double salarioA) {
        this.salario = salarioA;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getSalario() {
        return this.salario;
    }

    public void calcular_aumento() {
        if (this.edad > 30) {
            this.salario = salario + (salario * 0.1);
          
            
            } else {
                this.salario = salario + (salario*0.05);
        }
        System.out.println("Su nuevo salario es de: " + this.salario);
    }

   
    }


