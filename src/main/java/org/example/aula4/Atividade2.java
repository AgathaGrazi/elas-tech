package org.example.aula4;

public class Atividade2 {
    static void main() {
        //Questão 1
        int idade = 10;

        if (idade < 13) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("idoso");
        }
        //Questão 2
        double saldoConta = 500.00;
        double precoProduto = 320.00;

        if (saldoConta >= precoProduto) {
            System.out.println("Compra aprovada." + " E o saldo restante é: R$" + (saldoConta - precoProduto));
        } else {
            System.out.println("saldo insuficiente." + " E o saldo faltante é: R$" + (saldoConta - precoProduto));
        }
        //Questão 3
        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Café");
                break;
            case 2:
                System.out.println("Cappuccino");
                break;
            case 3:
                System.out.println("Chocolate");
                break;
            case 4:
                System.out.println("Chá");
                break;
            default:
                System.out.println("Opção inválida");
        }
        // Questão 4
        int idadef = 17;
        boolean temAutorizacao = true;

        if (idadef >= 18 || temAutorizacao == true) {
            System.out.println("Pode entrar!");
        } else {
            System.out.println("Não pode entrar!");
        }
        if (idadef >= 18 && temAutorizacao) {
            System.out.println("Pode entrar!");
        } else {
            System.out.println("Não pode entrar!");
        }
        //Desafio
        double nota1 = 5.3, nota2 = 7.8, nota3 = 4.5;
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Sua média é: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Aprovada!");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovada!");
        }
    }
}