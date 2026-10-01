package org.example.aula2;

public class Concatenacaolicao {
    static void main() {
        String nome = "Nicolas";
        String cidade = "Sorocaba";
        int idade = 14;
        System.out.println ("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos." );

        String produto = "Celular";
        double preco = 1500.55;
        int quantidade = 5;
        double resultadoPreco= preco*quantidade;
        System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$" +preco + " cada. Total: R$"
                + resultadoPreco);

        int numero1 = 20;
        int numero2 = 15;
        int resultado =numero1+numero2;
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + resultado);
    }
}
