package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej3ContarPositivosTest {
    @Test
    void arrayVacio() {
        int[] datosSolicitados = new int[]{Ej3ContarPositivos.contarPositivos(new int[]{})};
        int[] datosActual = new int[]{Ej3ContarPositivos.contarPositivos(new int[]{})};
        assertArrayEquals(datosSolicitados, datosActual);
    }
}