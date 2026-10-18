package org.example.aula17;

public class AulaSingleton {
    private static AulaSingleton instancia;

    private AulaSingleton(){

    }

    public static AulaSingleton getInstancia(){
        if (instancia == null){
            instancia = new AulaSingleton();
        }
        return instancia;
    }
}
