package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej2_ClasificarEdadTest {
    @Test
    void edadNegativa() {
        String edad = Ej2_ClasificarEdad.clasificarEdad(-18);
        assertThrows(IllegalArgumentException.class, () -> Ej2_ClasificarEdad.clasificarEdad(-18));
    }
    @Test
    void edadInfancia() {
        String edad = Ej2_ClasificarEdad.clasificarEdad(2);
        assertEquals("Infancia", edad);
    }
    @Test
    void edadNinyez() {
        String edad = Ej2_ClasificarEdad.clasificarEdad(9);
        assertEquals("Niñez", edad);
    }
    @Test
    void edadAdolescencia() {
        String edad = Ej2_ClasificarEdad.clasificarEdad(13);
        assertEquals("Adolescencia", edad);
    }
    @Test
    void edadJuventud() {
        String edad = Ej2_ClasificarEdad.clasificarEdad(20);
        assertEquals("Juventud", edad);
    }
    @Test
    void edadAdultez() {
        String edad = Ej2_ClasificarEdad.clasificarEdad(34);
        assertEquals("Adultez", edad);
    }
    @Test
    void edadVejez() {
        String edad = Ej2_ClasificarEdad.clasificarEdad(77);
        assertEquals("Vejez", edad);
    }
}