package cartas;

import jugadores.jugadores;

public class reyChompi extends cartas {

    public reyChompi() {
        super("Rey Chompi", 4, 2);
    }

    @Override
    public void alColocarse(jugadores propio, jugadores enemigo) {
        propio.curar(2);
    }
}
