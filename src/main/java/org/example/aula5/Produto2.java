package org.example.aula5;

import java.util.Scanner;

public class Produto2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {
            Produto novoProduto = new Produto();
            System.out.println("Digite o nome do produto: ");
            novoProduto.nomeProduto = scanner.nextLine();
            System.out.println("Digite o valor do produto: ");
            novoProduto.precoProduto = scanner.nextDouble();

            if (novoProduto.precoProduto > 100) {
                System.out.printf("O produto %s tem o valor de %.2f. Produto caro!\n", novoProduto.nomeProduto, novoProduto.precoProduto);
            } else {
                System.out.printf("O produto %s tem o valor de %.2f. Produto com preço acessível.\n", novoProduto.nomeProduto, novoProduto.precoProduto);
            }

            // Questão 6
            Scanner sc = new Scanner(System.in);
            String nome;
            int anoNascimento;

            System.out.println("Informe seu nome completo:");
            nome = sc.nextLine();
            System.out.println("Digite seu ano de nascimento:");
            anoNascimento = sc.nextInt();

            System.out.println("O usuário " + nome + " nasceu em " + anoNascimento);

            //Desafio
        }
    }
}