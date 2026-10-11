package org.example.Revisao;

import java.util.Scanner;

public class Condicionais {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // 1 - maior ou menor de idade
        System.out.print("Qual sua idade? ");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        // 2 - par ou ímpar
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Par.");
        } else {
            System.out.println("Ímpar.");
        }

        // 3 - qual é o maior
        System.out.print("Primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Segundo número: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("O maior é " + a);
        } else if (b > a) {
            System.out.println("O maior é " + b);
        } else {
            System.out.println("Os números são iguais.");
        }

        // 4 - nota
        System.out.print("Nota: ");
        double nota = sc.nextDouble();
        if (nota >= 7) {
            System.out.println("Aprovada");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }

        // 5 - switch com sabores
        System.out.print("Escolha um sabor (1 a 3): ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Chocolate");
                break;
            case 2:
                System.out.println("Morango");
                break;
            case 3:
                System.out.println("Baunilha");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // 6 - ingresso
        System.out.print("Insira sua idade: ");
        int idadeIngresso = sc.nextInt();
        if (idadeIngresso < 12 || idadeIngresso >= 60) {
            System.out.println("Ingresso: R$ 10");
        } else {
            System.out.println("Ingresso: R$ 25");
        }

        // Mini-desafio - triângulo
        System.out.print("Lado 1: ");
        double l1 = sc.nextDouble();
        System.out.print("Lado 2: ");
        double l2 = sc.nextDouble();
        System.out.print("Lado 3: ");
        double l3 = sc.nextDouble();

        if (l1 == l2 && l2 == l3) {
            System.out.println("Equilátero");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
    }
}
