package org.example;

public class Exe5 {
    public static void main(String[] args) {
        String stringTeste = "Teste mais um teste";
        String stringInvertida = "";
        for (int i = stringTeste.length() - 1; i >= 0; i--) {
            stringInvertida += stringTeste.charAt(i);
        }
        System.out.println("Correta : " + stringTeste);
        System.out.println("Invertida: " + stringInvertida);
    }
}






