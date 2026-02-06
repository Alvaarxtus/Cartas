package jugadores;

import java.util.ArrayList;
import cartas.cartas;

public class jugadores {

    private int vida;
    private ArrayList<cartas> cartasEnMesa;

    public jugadores(int vida) {
        this.vida = vida;
        cartasEnMesa = new ArrayList<>();
    }

    public void colocarCarta(cartas c, jugadores enemigo) {
        cartasEnMesa.add(c);
        c.alColocarse(this, enemigo);
    }

    public void recibirDaño(int d) {
        vida -= d;
    }

    public void curar(int c) {
        vida += c;
    }

    public int getVida() {
        return vida;
    }

    public ArrayList<cartas> getCartasEnMesa() {
        return cartasEnMesa;
    }
}
