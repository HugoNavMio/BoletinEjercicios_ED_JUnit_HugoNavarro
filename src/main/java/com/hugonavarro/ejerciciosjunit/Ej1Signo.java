package com.hugonavarro.ejerciciosjunit;

public class Ej1Signo {
    public static int signo(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        }
        return 0;
    }
}