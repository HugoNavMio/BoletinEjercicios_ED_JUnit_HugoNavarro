package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej1SignoTest {
    @Test
    void numeroMayor() {
        int x = Ej1Signo.signo(10);
        assertEquals(1, x);
    }

    @Test
    void numeroMenor() {
        int x = Ej1Signo.signo(-5);
        assertEquals(-1, x);
    }

    @Test
    void numeroCero() {
        int x = Ej1Signo.signo(0);
        assertEquals(0, x);
    }
}