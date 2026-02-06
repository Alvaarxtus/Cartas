package oveja;

import cartas.cartas;

public class efectooveja {

    private cartas carta;
    private int rondas = 1;

    public efectooveja(cartas c) {
        this.carta = c;
        carta.puedeAtacar = false;
    }

    public void pasarRonda() {
        rondas--;
        if (rondas <= 0) {
            carta.puedeAtacar = true;
        }
    }
}
