package org.example.Revisao;

import java.util.Scanner;

public class Loops {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // 1 - de 1 a 20
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        // 2 - contagem regressiva
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");

        // 3 - tabuada
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        // 4 - pares de 1 a 30
        for (int i = 2; i <= 30; i += 2) {
            System.out.println(i);
        }

        // 5 - soma de 1 a 100
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Soma: " + soma);

        // 6 - de 1 a 20 com while
        int j = 1;
        while (j <= 20) {
            System.out.println(j);
            j++;
        }

        // 7 - do while
        int energia = 3;
        do {
            System.out.println("Jogando...");
            energia--;
        } while (energia > 0);

        // Mini-desafio - triângulo de asteriscos
        System.out.print("Digite a altura: ");
        int altura = sc.nextInt();
        for (int linha = 1; linha <= altura; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
