package cartas;

import jugadores.jugadores;

public class cartas {

    protected String nombre;
    protected int vida;
    protected int daño;
    protected boolean puedeAtacar = true;

    public cartas(String nombre, int vida, int daño) {
        this.nombre = nombre;
        this.vida = vida;
        this.daño = daño;
    }

    public void alColocarse(jugadores propio, jugadores enemigo) {
    }

    public void atacar(cartas objetivo) {
        if (!puedeAtacar) return;
        objetivo.recibirDaño(daño);
    }

    public void recibirDaño(int d) {
        vida -= d;
    }

    public boolean estaMuerta() {
        return vida <= 0;
    }

    public void desactivarAtaque() {
        puedeAtacar = false;
    }

    public void activarAtaque() {
        puedeAtacar = true;
    }
}
