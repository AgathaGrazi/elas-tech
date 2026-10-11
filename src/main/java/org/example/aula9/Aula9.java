package org.example.aula9;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula9 {
    static void main() {
        //Q1
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        try {
            int resultado = numero1 / numero2;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }

        //Q2

        double[] notas = {7.5, 8.0, 6.5, 9.0, 10.0};

        System.out.println("Digite uma posição de 0 a 4:");
        int posicao = sc.nextInt();

        try {
            System.out.println("A nota é: " + notas[posicao]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe. O array só vai de 0 a 4.");
        }

        //Q3
        try {
            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();

            System.out.println("Sua idade é: " + idade + " anos.");

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um número.");
        }

        //Q4
        String nome = null;

        try {
            System.out.println(nome.length());
        } catch (NullPointerException e) {
            System.out.println("O nome não foi preenchido.");
        }

        //Q5
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        try {
            int resto = 100 % numero;
            System.out.println("O resto de 100 por " +numero + ": " + resto);

        } catch (ArithmeticException e) {
            System.out.println("Não é possível calcular o resto com zero.");
        }

        //Q6
        String[] nomes = {"Ana", "João", "Maria"};

        try {
            System.out.println(nomes[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe.");
        }

        System.out.println("O programa continua funcionando.");

    }


}
