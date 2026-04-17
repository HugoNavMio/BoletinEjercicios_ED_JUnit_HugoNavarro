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
    @Test
    void arrayNegativo() {
        int[] datosSolicitados = new int[]{Ej3ContarPositivos.contarPositivos(new int[]{-1, -2, -3, -4, -5})};
        int[] datosActual = new int[]{Ej3ContarPositivos.contarPositivos(new int[]{-1, -2, -3, -4, -5})};
        assertArrayEquals(datosSolicitados, datosActual);
    }
    @Test
    void arrayMezclado() {
        int[] datosSolicitados = new int[]{Ej3ContarPositivos.contarPositivos(new int[]{0, 1, -2, -3})};
        int[] datosActual = new int[]{Ej3ContarPositivos.contarPositivos(new int[]{0, 1, -2, -3})};
        assertArrayEquals(datosSolicitados, datosActual);
    }
    @Test
    void arrayPositivo() {
        int[] datosSolicitados = new int[]{Ej3ContarPositivos.contarPositivos(new int[]{1, 2, 3, 4})};
        int[] datosActual = new int[]{Ej3ContarPositivos.contarPositivos(new int[]{1, 2, 3, 4})};
        assertArrayEquals(datosSolicitados, datosActual);
    }
}