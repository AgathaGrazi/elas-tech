package org.example.Revisao;

import java.util.Scanner;

public class Arrays {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // 1 - primeiro, terceiro e último
        String[] nomes = {"Victor", "Bruno", "Leticia", "Diego", "Felipe"};
        System.out.println("Primeiro: " + nomes[0]);
        System.out.println("Terceiro: " + nomes[2]);
        System.out.println("Último: " + nomes[nomes.length - 1]);

        // 2 - imprimir todas as notas com laço
        int[] notas = {8, 6, 10, 7, 9};
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        // 3 - soma e média
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = (double) soma / notas.length;
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f%n", media);

        // 4 - maior número
        int[] numeros = {12, 45, 7, 89, 33};
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("Maior: " + maior);

        // 5 - contar notas >= 7
        int[] outras = {8, 5, 10, 4, 7};
        int contador = 0;
        for (int i = 0; i < outras.length; i++) {
            if (outras[i] >= 7) {
                contador++;
            }
        }
        System.out.println("Notas maiores ou iguais a 7: " + contador);

        // Mini-desafio - procurar um nome
        System.out.print("Digite um nome: ");
        String busca = sc.nextLine();
        int posicao = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(busca)) {
                posicao = i;
                break;
            }
        }
        if (posicao == -1) {
            System.out.println("Nome não está na lista.");
        } else {
            System.out.println("Encontrado na posição " + posicao);
        }
    }
}
