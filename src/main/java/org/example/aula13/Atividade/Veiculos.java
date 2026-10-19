package org.example.aula13.Atividade;

import java.util.ArrayList;

public class Veiculos {
    static void main() {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos){
            System.out.println();
            veiculo.acelerar();
            System.out.println();
            veiculo.ligar();
        }

    }
}
