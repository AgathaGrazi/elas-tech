package org.example.aula5;

import java.util.Scanner;

public class EstruturasRepeticao {
    static void main() {
        //exemplo for
        for (int i =0; i <= 5; i++) {
            System.out.println("Volta " + i);
        }

        //exemplo While - repete enquanto for verdade
        Scanner scanner = new Scanner(System.in);
        int senha = 0;

        while (senha != 1234){
            System.out.println("Digite sua senha: ");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso liberado!");

        //Do white - primeiro faz, depois pergunta
        do {
            System.out.println("Digite sua senha: ");
            senha = scanner.nextInt();}
        while (senha > 5);
        System.out.println("Acesso liberado");

    }
}
