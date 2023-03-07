package org.example;

public class Exe2 {
    public static void main(String[] args) {
        int numero = 21;
        int a = 0, b = 1;
        while (b < numero) {
            int teste = b;
            b = a + b;
            a = teste;
        }

        if (b == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}








