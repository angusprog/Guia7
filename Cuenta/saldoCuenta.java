package Cuenta;

import java.util.Scanner;

public class saldoCuenta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String resp;
        Cuenta c1 = new Cuenta();
        c1.setSaldo(10000);
        System.out.println("Ingrese titular");
        c1.setTitular(leer.nextLine());

        do {
            c1.retirar_dinero();
            System.out.println("saldo restante: " + c1.getSaldo());
            System.out.println("desea seguir retirando dinero? s/n");
            resp = leer.nextLine();
        } while (resp.equalsIgnoreCase("s"));
    
}}
