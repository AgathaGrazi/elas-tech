package org.example.Revisao;

import java.util.Scanner;

public class Strings {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // 1 - quantidade de letras
        System.out.print("Nome completo: ");
        String nome = sc.nextLine();
        System.out.println("Quantidade de letras: " + nome.length());

        // 2 - maiúsculo e minúsculo
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.println(nome2.toUpperCase());
        System.out.println(nome2.toLowerCase());

        // 3 - primeira letra
        System.out.print("Nome: ");
        String nome3 = sc.nextLine();
        System.out.println("Primeira letra: " + nome3.charAt(0));

        // 4 - palavra aparece na frase?
        System.out.print("Frase: ");
        String frase = sc.nextLine();
        System.out.print("Palavra: ");
        String palavra = sc.nextLine();
        if (frase.contains(palavra)) {
            System.out.println("A palavra aparece na frase.");
        } else {
            System.out.println("A palavra não aparece na frase.");
        }

        // 5 - dois nomes iguais, ignorando maiúsculas
        System.out.print("Primeiro nome: ");
        String n1 = sc.nextLine();
        System.out.print("Segundo nome: ");
        String n2 = sc.nextLine();
        if (n1.equalsIgnoreCase(n2)) {
            System.out.println("Os nomes são iguais.");
        } else {
            System.out.println("Os nomes são diferentes.");
        }

        // 6 - métodos encadeados
        System.out.print("Nome (pode ter espaços nas pontas): ");
        String nome6 = sc.nextLine();
        System.out.println(nome6.trim().toUpperCase());

        // Mini-desafio - começa e termina com a mesma letra
        System.out.print("Digite uma palavra: ");
        String p = sc.nextLine().toLowerCase();
        char primeira = p.charAt(0);
        char ultima = p.charAt(p.length() - 1);
        if (primeira == ultima) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

    }
}
