package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej1_SignoTest {
    @Test
    void signoMayor() {
        int x = 10;
        assertEquals(10, x);
    }
}