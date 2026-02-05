package cartas;
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

    public void alColocarse(Jugador propio, Jugador enemigo) {

    }

    public void atacar(cartas objetivo) {
        if (!puedeAtacar) return;

        objetivo.recibirDaño(this.daño);
    }

    public void recibirDaño(int daño) {
        vida -= daño;
    }

    public boolean estaMuerta() {
        return vida <= 0;
    }

    public String getNombre() {
        return nombre;
    }
}
