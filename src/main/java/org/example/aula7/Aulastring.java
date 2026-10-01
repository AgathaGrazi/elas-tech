package org.example.aula7;

import java.util.Scanner;

public class Aulastring {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //Q1
        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Seu nome possui " + nome.length() + " caracteres.");

        //Q2
        System.out.print("Digite seu nome: ");
        String nome2 = sc.nextLine();

        System.out.println("Maiúsculo: " + nome2.toUpperCase());
        System.out.println("Minúsculo: " + nome2.toLowerCase());

        //Q3
        System.out.println("Digite deu nome: ");
        String nome3 = sc.nextLine();
        System.out.println("Primeira letra: " + nome3.charAt(0));

        //Q4
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println("A palavra aparece na frase?" + frase.contains(palavra));

        //Q5
        System.out.println("Digite seu nome: ");
        String nomeA = sc.nextLine();
        System.out.println("Digite novamente seu nome: ");
        String nomeN = sc.nextLine();
    System.out.println("Os nomes são iguais?  " + nomeA.equalsIgnoreCase(nomeN));

    }}
