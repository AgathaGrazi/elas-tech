package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

public class AulaArrayList {
    static void main() {

    ArrayList<Integer> lista = new ArrayList<>();
    //add - adicional algo
    lista.add(1);
    lista.add(10);
    lista.add(100);

    //addAll (List.of) - colocar vários em um só.

    lista.addAll(List.of(1,2,4, 3, 5, 48, 548));
        System.out.println(lista);

        //remove - remover uma posição da lista
        lista.remove(1);
        System.out.println(lista);

        //get pegar na lista a posição inserida (imã)
        System.out.println(lista.get(5));

        //set - muda uma coisa por outra; primeiro informar a posição e depois o valor que será inserido no lugar do outro.
        lista.set(0, 50);
        System.out.println(lista);

        //size - contas quantas posições tem
        System.out.println(lista.size());

        //contains - ele valida se o valor inserido consta no que foi adicionado
        System.out.println(lista.contains(55));

        //indexOf - é para informar a posição da coisa
        System.out.println(lista.indexOf(5));

        //isEmpty - falar se lista está vazia
        System.out.println(lista.isEmpty());



}}
