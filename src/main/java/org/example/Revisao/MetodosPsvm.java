package org.example.Revisao;

import static org.example.Revisao.Metodos.*;

public class MetodosPsvm {
    static void main() {
        // 1
        mostrarBoasVindas();

        // 2
        saudacao("Joana");
        saudacao("Bruno");
        saudacao("Carla");

        // 3
        int resultado = dobro(7);
        System.out.println("Dobro de 7: " + resultado);

        // 4
        double media = calcularMedia(8.0, 7.0);
        System.out.printf("Média: %.2f%n", media);

        // 5
        int numero = 10;
        if (ehPar(numero)) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }

        // 6
        System.out.println("Soma de 2 números: " + somar(3, 4));
        System.out.println("Soma de 3 números: " + somar(3, 4, 5));

        // Mini-desafio:
        liberarEntrada(20);
        liberarEntrada(15);
    }
}
