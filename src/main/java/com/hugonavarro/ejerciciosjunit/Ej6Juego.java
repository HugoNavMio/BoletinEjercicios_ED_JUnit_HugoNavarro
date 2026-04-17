package com.hugonavarro.ejerciciosjunit;

public class Ej6Juego {
    public static String jugar(String jugador1, String jugador2) {
        if (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA")) {
            throw new IllegalArgumentException("Jugada no válida para el jugador1");
        }
        if (!jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERA")) {
            throw new IllegalArgumentException("Jugada no válida para el jugador2");
        }
        if (jugador1.equals(jugador2)) {
            return "EMPATE";
        }
        if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")) || (jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) || (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))) {
            return "GANA EL JUGADOR1";
        } else {
            return "GANA EL JUGADOR2";
        }
    }
}
