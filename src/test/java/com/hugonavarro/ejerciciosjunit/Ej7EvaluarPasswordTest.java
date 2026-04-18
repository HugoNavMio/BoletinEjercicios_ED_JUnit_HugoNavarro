package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej7EvaluarPasswordTest {
    @Test
    void longitudMinimaSoloMayusculas() {
        assertEquals(1, Ej7EvaluarPassword.evaluarPassword("HOLA"));
    }
    @Test
    void longitudMaximaSoloMayusculas() {
        assertEquals(2, Ej7EvaluarPassword.evaluarPassword("TEXTOLARGO"));
    }
    @Test
    void longitudMinimaSoloMinusculas() {
        assertEquals(1, Ej7EvaluarPassword.evaluarPassword("adios"));
    }
    @Test
    void longitudMaximaSoloMinusculas() {
        assertEquals(2, Ej7EvaluarPassword.evaluarPassword("textodiminuto"));
    }
    @Test
    void longitudMinimaSoloNumeros() {
        assertEquals(1, Ej7EvaluarPassword.evaluarPassword("1234"));
    }
    @Test
    void longitudMaximaSoloNumeros() {
        assertEquals(2, Ej7EvaluarPassword.evaluarPassword("987654321"));
    }
    @Test
    void longitudMinimaSoloSimbolos() {
        assertEquals(1, Ej7EvaluarPassword.evaluarPassword("¡¿?!"));
    }
    @Test
    void longitudMaximaSoloSimbolos() {
        assertEquals(2, Ej7EvaluarPassword.evaluarPassword("¡¿()[]{}?!"));
    }
    @Test
    void mayusculasYMinusculas() {
        assertEquals(3, Ej7EvaluarPassword.evaluarPassword("HoLaBuEnAs"));
    }
    @Test
    void mayusculasYNumeros() {
        assertEquals(3, Ej7EvaluarPassword.evaluarPassword("CONTRA345"));
    }
    @Test
    void mayusculasYSimbolos() {
        assertEquals(3, Ej7EvaluarPassword.evaluarPassword("_%HO%LA%_"));
    }
    @Test
    void minusculasYNumeros() {
        assertEquals(3, Ej7EvaluarPassword.evaluarPassword("numero0123"));
    }
    @Test
    void minusculasYSimbolos() {
        assertEquals(3, Ej7EvaluarPassword.evaluarPassword("_con_tra_"));
    }
    @Test
    void numerosYSimbolos() {
        assertEquals(3, Ej7EvaluarPassword.evaluarPassword("-123|456-"));
    }
    @Test
    void mayusculasMinusculasYNumeros() {
        assertEquals(4, Ej7EvaluarPassword.evaluarPassword("54321Adios"));
    }
    @Test
    void mayusculasMinusculasYSimbolos() {
        assertEquals(4, Ej7EvaluarPassword.evaluarPassword("PassWord%"));
    }
    @Test
    void mayusculasNumerosYSimbolos() {
        assertEquals(4, Ej7EvaluarPassword.evaluarPassword("67-LOL-67"));
    }
    @Test
    void minusculasNumerosYSimbolos() {
        assertEquals(4, Ej7EvaluarPassword.evaluarPassword("(estoy_10)"));
    }
    @Test
    void longitudMinimaConTodosLosPasos() {
        assertEquals(4, Ej7EvaluarPassword.evaluarPassword("Z0z$"));
    }
    @Test
    void longitudMaximaConTodosLosPasos() {
        assertEquals(5, Ej7EvaluarPassword.evaluarPassword("[1CoNTrA1]"));
    }
}