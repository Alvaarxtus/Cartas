package cartas;

import jugadores.jugadores;
import oveja.efectooveja;

public class kaos extends cartas {

    public kaos() {
        super("Kaos", 5, 3);
    }

    @Override
    public void alColocarse(jugadores propio, jugadores enemigo) {
        cartas mejor = null;

        for (cartas c : enemigo.getCartasEnMesa()) {
            if (mejor == null || c.daño > mejor.daño) {
                mejor = c;
            }
        }

        if (mejor != null) {
            new efectooveja(mejor);
        }
    }
}
