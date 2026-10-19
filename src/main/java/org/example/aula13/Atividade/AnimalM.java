package org.example.aula13.Atividade;

import java.util.ArrayList;

public class AnimalM {
    static void main() {
        //Q1
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();

        //Q2
        Animal bidu = new Cachorro();
        bidu.emitirSom();
        Animal salem = new Gato();
        salem.emitirSom();

        //Q3
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal aniaml : animais){
            aniaml.emitirSom();
        }
        //Q4


    }
}
