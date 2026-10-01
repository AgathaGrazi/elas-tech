package org.example.aula5;

public class Pet2 {
    static void main() {
        Pet gato = new Pet();
        gato.nome= "Haji";
        gato.raca= "Siames";
        gato.peso= 10;

        Pet cachorro = new Pet();
    cachorro.nome = "Fofinho";
    cachorro.raca = "Rottweiler";
    cachorro.peso = 15.500;

    System.out.println("O gatinho " + gato.nome + " é um " + gato.raca + " de " + gato.peso +
            "kg. Já o cachorro " + cachorro.nome + " é um " + cachorro.raca + " de " + cachorro.peso + " kg!");


    }
}