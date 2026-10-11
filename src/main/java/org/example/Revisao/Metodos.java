package org.example.Revisao;

public class Metodos {
    // 1 - sem parâmetro, sem retorno
    static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao programa!");
    }

    // 2 - com parâmetro, sem retorno
    static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    // 3 - com retorno
    static int dobro(int numero) {
        return numero * 2;
    }

    // 4 - média de dois números
    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // 5 - retorna boolean
    static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    // 6 - sobrecarga: mesmo nome, parâmetros diferentes
    static int somar(int a, int b) {
        return a + b;
    }

    static int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Mini-desafio
    static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    static void liberarEntrada(int idade) {
        if (ehMaiorDeIdade(idade)) {
            System.out.println("Entrada liberada.");
        } else {
            System.out.println("Entrada negada.");
        }
    }
}
