package rondas;

import jugadores.jugadores;
import cartas.cartas;

public class contadorrondas {

    public static void pasarRonda(jugadores j) {
        j.getCartasEnMesa().removeIf(cartas::estaMuerta);
    }
}

