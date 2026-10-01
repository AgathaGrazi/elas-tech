package org.example.aula1;

public class Concatenacao {
    static void main() {
        String nome = "Agatha";
        int idade = 20;
        double altura = 1.70;
        String cep = "18105-030";
        boolean ehFumante = false ;
        double peso = 60.50;
        String telefone = "(15) 95248-3641";
        boolean temCarteira = true;
        String profissão = "professor";
        int anoNascimento = 1980;
        double temperatura = 15;
        int nota = 100;

        System.out.println("Seus dados São: ");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(ehFumante);
        System.out.println(peso);
        System.out.println(telefone);
        System.out.println(temCarteira);
        System.out.println(profissão);
        System.out.println(anoNascimento);
        System.out.println(temperatura);
        System.out.println(nota);

        System.out.println("Olá " + nome  + " sua nota foi " + nota );
    }
}
