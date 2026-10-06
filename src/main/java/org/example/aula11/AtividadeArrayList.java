package org.example.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeArrayList {
    static void main() {
        //Q1
        ArrayList<String> nome4 = new ArrayList<>();
        nome4.add("Agatha");
        nome4.add("Nicolas");
        nome4.add("Miguel");
        System.out.println(nome4);

        //Q2
        ArrayList<String> lista = new ArrayList<>(List.of("Banana", "pera", "Maçã", "Manga"));
        System.out.println(lista);
        System.out.println(lista.get(0));
        System.out.println(lista.get(3));
        System.out.println(lista.size());

        //Q3
        ArrayList <String> nome1 = new ArrayList<>();
        nome1.add("Agatha");
        nome1.add("Nicolas");
        nome1.add("Miguel");
        nome1.add("Felipe");
        System.out.println(nome1);
        nome1.set(2,"Diana");
        System.out.println(nome1);

        //Q4
        ArrayList <String> cidade = new ArrayList<>(List.of("Bahia", "São Paulo", "Rio de Janeiro", "Minas Gerais"));
        System.out.println(cidade);
        cidade.remove(1);
        System.out.println(cidade);
        System.out.println(cidade.size());

        //Q5
        ArrayList <String> nome2 = new ArrayList<>(List.of("Gabriel", "Paulo", "Debora", "Brenda", "Biatriz", "Tarcisio"));
        for (int i=0; i< nome2.size();i++) {
            System.out.println(i + ": " + nome2.get(i));}

        //Q6
        Scanner sc = new Scanner(System.in);

        ArrayList <String> nome3 = new ArrayList<>(List.of("Gabriel", "Paulo", "Debora", "Brenda", "Biatriz"));

        System.out.println("Digite seu nome");
        String nome = sc.nextLine();

        int posicao = nome3.indexOf(nome);

        if (posicao != -1) {
            System.out.println("O nome está na posição: " + posicao);
        } else {
            System.out.println("Nome não encontrado na lista.");
        }
    }

}
