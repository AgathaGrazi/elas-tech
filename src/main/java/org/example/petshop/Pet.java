package org.example.petshop;

public class Pet {
    String nomeP;
    String especieP;
    String porte;
    double pesoP;


    String definirPorte(){
        if (pesoP < 10) {
            return "Pequeno";
        }else if (pesoP < 25) {
            return "Médio";
        }else{
            return "Grande";
        }
    }
    void emitirSom(){
        System.out.println(nomeP + " está emitindo um som...");
    }
}
