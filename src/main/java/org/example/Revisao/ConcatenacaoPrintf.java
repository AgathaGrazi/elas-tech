package org.example.Revisao;

public class ConcatenacaoPrintf {
    static void main() {
        // 1 - concatenação
        String nome = "Agatha";
        int idade = 36;
        System.out.println(nome + " tem " + idade + " anos.");

        // 2 - média com duas casas
        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;
        System.out.printf("Média: %.2f%n", media);

        // 3 - preço com duas casas
        double preco = 49.5;
        System.out.printf("Preço: R$ %.2f%n", preco);

        // 4 - nome, idade e altura numa linha
        double altura = 1.65;
        System.out.printf("Nome: %s | Idade: %d | Altura: %.2f%n", nome, idade, altura);

        // Mini-desafio - recibo
        String produto1 = "Arroz";   double preco1 = 23.50;
        String produto2 = "Feijão";  double preco2 = 8.90;
        String produto3 = "Café";    double preco3 = 25.75;

        double total = 0;
        total += preco1;
        total += preco2;
        total += preco3;

        System.out.println("  RECIBO  ");
        System.out.printf("%s - R$ %.2f%n", produto1, preco1);
        System.out.printf("%s - R$ %.2f%n", produto2, preco2);
        System.out.printf("%s - R$ %.2f%n", produto3, preco3);
        System.out.printf("TOTAL - R$ %.2f%n", total);
    }
}