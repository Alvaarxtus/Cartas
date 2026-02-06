package juego;

import jugadores.jugadores;
import cartas.*;
import rondas.contadorrondas;

public class juego {

    public static void main(String[] args) {

        jugadores jugador = new jugadores(10);
        jugadores bot = new jugadores(10);

        jugador.colocarCarta(new reyChompi(), bot);
        bot.colocarCarta(new chillibill(), jugador);

        contadorrondas.pasarRonda(jugador);
        contadorrondas.pasarRonda(bot);

        System.out.println("Vida jugador: " + jugador.getVida());
        System.out.println("Vida bot: " + bot.getVida());
    }
}
