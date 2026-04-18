package com.hugonavarro.ejerciciosjunit;

public class Ej7EvaluarPassword {
    public static int evaluarPassword(String password) {
        int puntos = 0;

        if (password.length() >= 8) {
            puntos++;
        }

        boolean contieneMayusculas = false;
        boolean contieneMinusculas = false;
        boolean contieneNumeros = false;
        boolean contieneSimbolos = false;

        for (char c : password.toCharArray()) {
            switch (Character.getType(c)) {
                case Character.UPPERCASE_LETTER:
                    contieneMayusculas = true;
                    break;
                case Character.LOWERCASE_LETTER:
                    contieneMinusculas = true;
                    break;
                case Character.DECIMAL_DIGIT_NUMBER:
                    contieneNumeros = true;
                    break;
                default:
                    contieneSimbolos = true;
                    break;
            }
        }

        if (contieneMayusculas) puntos++;
        if (contieneMinusculas) puntos++;
        if (contieneNumeros) puntos++;
        if (contieneSimbolos) puntos++;

        return puntos;
    }
}
