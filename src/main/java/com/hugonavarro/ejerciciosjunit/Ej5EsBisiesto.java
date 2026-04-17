package com.hugonavarro.ejerciciosjunit;

public class Ej5EsBisiesto {
    public static boolean esBisiesto(int anyo) {
        if (anyo % 4 != 0) {
            return false;
        } else if (anyo % 400 == 0) {
            return true;
        } else if (anyo % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
