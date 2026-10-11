package org.example.aula13;

import java.util.ArrayList;
import java.util.List;

public class Feach {
    static void main() {

        ArrayList<String> animais = new ArrayList<>(List.of("Macaco", "Urubu", "Elefante", "Girafa"));
        animais.add("Gato");
        for (String animal : animais) {
            System.out.println(animal);
        }
       /* for (int i= 0; i < animais.size();i++);{
            System.out.println(animais.get(i));
        }*/

        }
    }

