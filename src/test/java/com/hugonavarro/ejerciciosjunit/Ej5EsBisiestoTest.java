package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej5EsBisiestoTest {
    @Test
    void noEsDivisiblePor4() {
        assertFalse(Ej5EsBisiesto.esBisiesto(2022));
    }
    @Test
    void esDivisiblePor400() {
        assertTrue(Ej5EsBisiesto.esBisiesto(2000));
    }
    @Test
    void esDivisiblePor100() {
        assertFalse(Ej5EsBisiesto.esBisiesto(1900));
    }
    @Test
    void esDivisiblePor4() {
        assertTrue(Ej5EsBisiesto.esBisiesto(2012));
    }
}