package org.example.aula7;

import java.util.Scanner;

public class AulaArray {
    static void main() {

        /*Q1
        String[] nome = {"Beatriz", "Ana", "Giovanna", "Pedro", "Felipe"};
        for (int i=0; i< nome.length; i +=2) {
            System.out.println(nome[i]);*/


        /*Q2
            int[] notas = {8, 6, 10, 7, 9};
        for (int i=0; i < notas.length; i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);*/

            /*Q3
            int[] notas = {8, 6, 10, 7, 9};
            int soma = 0;

        for (int i=0; i < notas.length; i++) {
            soma = soma + notas[i];}
        double media = soma / notas.length;
            System.out.println("Soma: " + soma);
            System.out.println("Media: " + media);*/

        //Q4
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[5];

        for (int i = 0; i < numero.length; i++){
        System.out.println("Digite um número: ");
        numero[i] = sc.nextInt();}
        System.out.println("Números decrescentes:");
     for (int i = numero.length - 1; i >=0; i--){
         System.out.println(numero[i]);
     }

    }}

