package org.example.aula5;

import java.util.Scanner;

public class Scannear {
    static void main() {
      Animal gato = new Animal();
      gato.nome = "Bolinha de Pelo";
      gato.especie = "Gato";
      System.out.println(gato.nome + " é um " + gato.especie);

      //Scanner
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Escreva sua idade:");
        idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);
        sc.nextLine();
        System.out.println("Escreva seu nome:");
        nome = sc.nextLine();
        System.out.println("Seu nome é: " + nome);






    }
}
