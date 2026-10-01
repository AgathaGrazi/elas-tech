package org.example.aula5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
       Scanner scane = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 2){
            System.out.println("Deseja iniciar? Pressione 1 continuar, 2 para sair");
            opcao = scane.nextInt();

            switch (opcao){
                case 1:
                    Aluna aluna = new Aluna();

                    System.out.println("Nota 1: ");
                    aluna.nota = scane.nextDouble();

                    System.out.println("Nota 2: ");
                    aluna.nota2 = scane.nextDouble();

                    System.out.println("Nome aluna: ");
                    scane.nextLine();
                    aluna.nomeAluna = scane.nextLine();

                    aluna.media = (aluna.nota + aluna.nota2) /2;

                    if ((aluna.media >= 6)) {
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }
                    System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, e sua média final foi %.1f. Aluna aprovada: %b%n", aluna.nomeAluna, aluna.nota, aluna.nota2, aluna.media, aluna.passou);

                break;
                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }

        }
    }
}
