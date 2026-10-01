package org.example.aula8;

import java.util.Scanner;

import static org.example.aula8.Metodos.*;

public class Metodo {
    static void main() {
        //Q1
        mostrarBoasVindas();

        //Q2
        saudar("Joana");
        saudar("Beatriz");
        saudar("Karol");

        //Q3
        System.out.println(dobro(5));

        //Q4
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int n1 = sc.nextInt();
        System.out.println("Digite sua nota: ");
        int n2 = sc.nextInt();
        System.out.println("Sua média é: " + calcularMedia(n1, n2));

        //Q5
        Scanner sca = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sca.nextInt();

        if (ehMaiorDeIdade(idade)) {
        System.out.println("Maior de idade");}
        else{
            System.out.println("Menor de idade");
    }

        //Q6
        System.out.println();

        //Q7
        saudacao();
        saudacao("Agatha");



    }














    static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");}

    }


