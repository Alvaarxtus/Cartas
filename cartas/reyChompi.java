package cartas;

import jugadores.jugadores;
import tipo.TipoCarta;

public class reyChompi extends cartas {

    public reyChompi() {
        super("Rey Chompi", 4, 2);
    }

    @Override
    public void alColocarse(jugadores propio, jugadores enemigo) {
        propio.curar(2);
    }

    @Override
    public TipoCarta getTipo() {
        return TipoCarta.ROCA;
    }
}
