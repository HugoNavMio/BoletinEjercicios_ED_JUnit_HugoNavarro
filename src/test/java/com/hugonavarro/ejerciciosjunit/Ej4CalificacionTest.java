package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej4CalificacionTest {
    @Test
    void notaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> Ej4Calificacion.calificacion(-3));
    }
    @Test
    void notaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> Ej4Calificacion.calificacion(20));
    }
    @Test
    void notaSuspenso() {
        String nota = Ej4Calificacion.calificacion(4);
        assertEquals("SUSPENSO", nota);
    }
    @Test
    void notaSuficiente() {
        String nota = Ej4Calificacion.calificacion(5);
        assertEquals("SUFICIENTE", nota);
    }
    @Test
    void notaBien() {
        String nota = Ej4Calificacion.calificacion(6);
        assertEquals("BIEN", nota);
    }
    @Test
    void notaNotable() {
        String nota = Ej4Calificacion.calificacion(7);
        assertEquals("NOTABLE", nota);
    }
    @Test
    void notaSobresaliente() {
        String nota = Ej4Calificacion.calificacion(10);
        assertEquals("SOBRESALIENTE", nota);
    }
}