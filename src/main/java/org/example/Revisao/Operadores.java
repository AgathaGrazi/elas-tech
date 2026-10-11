package org.example.Revisao;

public class Operadores {
    static void main() {
        // 1 - operações básicas
        int a = 15;
        int b = 4;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        // 2 - saldo
        int saldo = 1000;
        saldo += 250;
        saldo -= 380;
        System.out.println("Saldo final: " + saldo);

        // 3 - comparações (reaproveitando a e b)
        a = 10;
        b = 10;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);

        // 4 - operador lógico
        int idade = 30;
        boolean temCarteira = true;
        System.out.println(idade >= 18 && temCarteira);

        // 5 - resto da divisão por 2
        int numero = 7;
        System.out.println(numero % 2);

        // 6 - total da compra
        double total = 3 * 5.50;
        System.out.println("Total: R$ " + total);

        // Mini-desafio - divisível por 3 e por 5
        int n = 30;
        System.out.println(n % 3 == 0 && n % 5 == 0);
    }
}