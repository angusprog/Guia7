package Juego;



public class quienGana {

    public static void main(String[] args) {
        Juego j1 = new Juego();
        for (int i = 0; i < 3; i++) {
            j1.iniciar_juego();
        }
        j1.MostrarVictoriasJugador1();
        j1.MostrarVictoriasJugador2();
        j1.MostrarGanador();
    }

}

