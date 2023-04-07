/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.Scanner;

public class Juego {

    private int jugador1eleccion;
    private int jugador2eleccion;
    private int victoriasjugador1 = 0;
    private int victoriasjugador2 = 0;

    public void iniciar_juego() {
        JuegaJugador1();
        JuegaJugador2();
    }

    private void JuegaJugador1() {
        Scanner leer = new Scanner(System.in);
        int adivinar;
        System.out.println("Jugador 1 elije un numero");
        this.jugador1eleccion = leer.nextInt();
        System.out.println("Jugador 2 intentara adivinar, 3 intentos");
        for (int i = 0; i < 3; i++) {
            System.out.println("Intento" + (i + 1));
            adivinar = leer.nextInt();
            if (adivinar == jugador1eleccion) {
                System.out.println("Acerto el jugador 2");
                victoriasjugador2++;
                break;
            } else {
                if (adivinar > jugador1eleccion) {
                    System.out.println("El numero elejido es mayor que el seleccionado por el jugador 1");
                } else {
                    System.out.println("El numero elejido es menor que el seleccionado por el jugador 1");
                }
            }
            if (i == 2) {
                System.out.println("Usted perdio sus intentos");
            }
        }

    }

    private void JuegaJugador2() {
        Scanner leer = new Scanner(System.in);

        int adivinar;
        System.out.println("Jugador 2 elije un numero");
        this.jugador2eleccion = leer.nextInt();
        System.out.println("Jugador 1 intentara adivinar, 3 intentos");
        for (int i = 0; i < 3; i++) {
            System.out.println("Intento" + (i + 1));
            adivinar = leer.nextInt();
            if (adivinar == jugador2eleccion) {
                System.out.println("Acerto el jugador 1");
                victoriasjugador1++;
                break;
            } else {
                if (adivinar > jugador1eleccion) {
                    System.out.println("El numero elejido es mayor que el seleccionado por el jugador 2");
                } else {
                    System.out.println("El numero elejido es menor que el seleccionado por el jugador 2");
                }
            }
            if (i == 2) {
                System.out.println("Usted perdio sus intentos");
            }
        }

    }

    public void MostrarVictoriasJugador2() {
        System.out.println("Victorias jugador 2: " + victoriasjugador2);

    }

    public void MostrarVictoriasJugador1() {
        System.out.println("Victorias jugador 1: " + victoriasjugador1);

    }

    public void MostrarGanador() {
        if (victoriasjugador1 > victoriasjugador2) {
            System.out.println("Gano jugador 1");
        } else {
            System.out.println("Gano jugador 2");
        }
    }

}

