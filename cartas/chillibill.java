package cartas;

import jugadores.jugadores;

public class chillibill extends cartas {

    public chillibill() {
        super("Chilli", 2, 1);
    }

    @Override
    public void alColocarse(jugadores propio, jugadores enemigo) {
        for (cartas c : enemigo.getCartasEnMesa()) {
            c.recibirDaño(1);
        }
    }
}
