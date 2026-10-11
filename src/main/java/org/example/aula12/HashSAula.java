package org.example.aula12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSAula {
    static void main() {
        //
        //Q1
        HashSet<String> nome = new HashSet<>();
        nome.addAll(List.of("Caio","José", "João", "Caio"));
        System.out.println(nome);
        System.out.println(nome.size());

        //Q2
        HashSet<String> cores = new HashSet<>();
        cores.addAll(List.of("Verde", "preto", "Amarelo", "Azul", "Rosa", "Branco"));
        if (cores.contains("Verde")) {
        System.out.println("A cor verde consta na lista de cores.");}
        else {
            System.out.println("A cor verde não consta na lista de cores.");
        }

        //Q3
        ArrayList<String> nomes = new ArrayList<>();
        nomes.addAll(List.of("Ana", "Bia", "Diana", "João", "Diana", "Ana"));

        HashSet<String> limparnome = new HashSet<>(nomes);
        System.out.println("Lista: " + nomes);
        System.out.println("Lista sem nomes repetidos: " + limparnome);

        //Q4
        HashSet<String> cpfs = new HashSet<>();
        cpfs.addAll(List.of("388.286.019-38", "987.646.321-82", "185.222.397-19"));
        System.out.println("CPFs: " + cpfs);

        cpfs.remove("987.646.321-82");
        System.out.println("CPFs: " + cpfs);
        System.out.println(cpfs.size());

        //Q5
        HashSet<String> frutas = new HashSet<>();

        frutas.addAll(List.of("Maçã", "Banana", "Pera"));

        for (String fruta : frutas){
            System.out.println(fruta); }

        //Q6
        HashSet<String> cidade = new HashSet<>();

        System.out.println(cidade.isEmpty());

        cidade.add("São Paulo");

        System.out.println(cidade.isEmpty());
    }
}
 /*add();
 contains();
 remove();
 size();
 isEmpty();
 clear();
 new HashSet<>(lista);
 addAll(List.of());
  */


