package org.example.aula5;

import java.util.Scanner;

public class Atividade3 {
    static void main() {
        // Questão 3
        Scanner sca = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair");
            System.out.println("Escolha a opção: ");
            opcao = sca.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Ver camisas");
                    break;
                case 2:
                    System.out.println("Ver calças");
                    break;
                case 3:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
        } while (opcao!=3);
    }
}
