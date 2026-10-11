package org.example.Revisao;

import java.util.Scanner;

public class AtivScan {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // 1 - olá
        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome + "!");

        // 2 - próximo aniversário
        System.out.print("Qual é a sua idade? ");
        int idade = sc.nextInt();
        System.out.println("No próximo aniversário você fará " + (idade + 1) + " anos.");

        // 3 - soma de dois números
        System.out.print("Primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Soma: " + (n1 + n2));

        // 4 - altura e peso
        System.out.print("Qual é a sua altura? ");
        double altura = sc.nextDouble();
        System.out.print("Qual é o seu peso? ");
        double peso = sc.nextDouble();
        System.out.println("Você tem " + altura + " m e pesa " + peso + " kg.");

        // Mini-desafio - ficha (idade, nome, cidade)
        System.out.print("Idade: ");
        int idadeFicha = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String nomeFicha = sc.nextLine();
        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.println(" FICHA ");
        System.out.println("Nome: " + nomeFicha);
        System.out.println("Idade: " + idadeFicha);
        System.out.println("Cidade: " + cidade);

    }
}
