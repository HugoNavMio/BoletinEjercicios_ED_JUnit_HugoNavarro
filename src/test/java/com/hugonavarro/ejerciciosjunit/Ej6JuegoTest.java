package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej6JuegoTest {
    @Test
    void datoInvalidoJugador1() {
        assertThrows(IllegalArgumentException.class, () -> Ej6Juego.jugar("INVÁLIDO", "PIEDRA"));
    }
    @Test
    void datoInvalidoJugador2() {
        assertThrows(IllegalArgumentException.class, () -> Ej6Juego.jugar("TIJERA", "INVÁLIDO"));
    }
    @Test
    void datosInvalidosDeAmbosJugadores() {
        assertThrows(IllegalArgumentException.class, () -> Ej6Juego.jugar("INVÁLIDO", "INVÁLIDO"));
    }
    @Test
    void empate() {
        assertEquals("EMPATE", Ej6Juego.jugar("PAPEL", "PAPEL"));
    }
    @Test
    void jugador1Gana() {
        assertEquals("GANA EL JUGADOR1", Ej6Juego.jugar("TIJERA", "PAPEL"));
    }
    @Test
    void jugador2Gana() {
        assertEquals("GANA EL JUGADOR2", Ej6Juego.jugar("PIEDRA", "PAPEL"));
    }
}