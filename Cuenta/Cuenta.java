package Cuenta;

import java.util.Scanner;

public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //metodo...
    public double retirar_dinero() {
        Scanner leer = new Scanner(System.in);
        double retiro;
        System.out.println("Cuanto desea retirar?");
        retiro = leer.nextDouble();
        if (saldo > retiro) {
            saldo -= retiro;
        } else {
            System.out.println("Tu saldo es insuficiente");
        }
        return saldo;
    
}}
