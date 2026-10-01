package org.example.aula7;

import java.util.Scanner;

public class Scan {
    static void main() {
       /* Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Qual seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual sua idade? ");
        idade = sc.nextInt();

        System.out.println("Olá " + nome + " você tem " + idade + " e vai fazer " + (idade + 1) + " no próximo ano!");*/

        /*Q2
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero   = sc.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = sc.nextInt();

        System.out.println("Soma: " + (numero+numero2));
        System.out.println("Subtração: " + (numero-numero2));
        System.out.println("Multiplicação: " +(numero*numero2));
        System.out.println("Divisão: " + (numero/numero2));
        System.out.println("Resto: " + (numero%numero2));*/

        /*Q3
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int nota   = sc.nextInt();

        if (nota >=7) {
            System.out.println("Aprovada!");
        } else if (nota >=5) {
            System.out.println("Ficou em recuperação!");
        }else{
            System.out.println("Reprovada!");*/

        //Q4
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número para visualizar a tabuada: ");
        int tabuada   = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));


            
        }


    }
}
