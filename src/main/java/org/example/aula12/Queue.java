package org.example.aula12;

import java.util.ArrayDeque;
import java.util.List;

public class Queue {
    static void main() {

        //Q1
        ArrayDeque<String> fila = new ArrayDeque<>();
        if (fila.isEmpty() != true){
        }
        else {

            fila.add("Ana");
            fila.add("João");
            fila.add("Maria");

            System.out.println("Fila: " + fila);
            System.out.println("Quantidade de pessoas: " + fila.size());
        }
        //Q2
        ArrayDeque<String> fila1 = new ArrayDeque<>();
        fila1.addAll(List.of("Miguel", "Valeria", "Ana"));

        System.out.println("Fila: " + fila1);
        System.out.println("Próximo da fila: " + fila1.peek());

        //Q3
        System.out.println("Pessoa atendida: " + fila1.poll());

        System.out.println("Fila depois: " + fila1);

        //Q4
        ArrayDeque<String> fila2 = new ArrayDeque<>();
        fila2.addAll(List.of("Diego", "Luciana", "Maria"));

        while (!fila2.isEmpty()) {
            System.out.println("Atendendo: " + fila2.poll());
        }   System.out.println("Fila vazia!");

        //Q5
        ArrayDeque<String> fila3 = new ArrayDeque<>();
        fila3.addAll(List.of("Nicolas", "Soraya", "Adriana"));

        System.out.println("Nicolas está na fila? " + fila3.contains("Nicolas"));
        System.out.println("Guilherme está na fila? " + fila3.contains("Guilherme"));

        //Q6
        ArrayDeque<String> fila4 = new ArrayDeque<>();
        if (fila4.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila4.peek());
        }

        fila4.add("Ana");
        if (fila4.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila4.peek());
        }

    }
}
    /*
        .add("Ana");
        .peek();
        .poll(); remover a primeira posição
        .isEmpty();
        .size();
        .contains("Bia");
        .addAll(List.of("Ana","Bia"));
        boa pratica fazer um if(fila.isEmpty() == true){
        */
/*add(); - adicionar um item
        - peek(); - ver quem é o primeiro da fila / espiar
          poll(); - mandar embora o primeiro elemento
          isEmpty(); - validar se a fila está vazia
          size(); - contar quantas posições tem na fila
          contains(); = ele valida se o valor inserido consta no que foi adicionado
          addAll(List.of()); - colocar vários elementos de uma vez só.*/



