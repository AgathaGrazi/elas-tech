package org.example.Revisao;

public class Variaveis {
    static void main() {
        // 1 - variáveis básicas
        String nome = "Agatha";
        int idade = 36;
        double altura = 1.59;
        boolean jaProgramou = false;
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(jaProgramou);

        // 2 - cidade
        String cidade = "Sorocaba";
        System.out.println("Eu moro em " + cidade + ".");

        // 3 - nome completo
        String primeiroNome = "Agatha";
        String sobrenome = "Dos Santos";
        System.out.println(primeiroNome + " " + sobrenome);

        // 4 - preço
        double preco = 29.90;
        System.out.println("O preço é R$ " + preco);

        // 5 - boolean
        boolean temCarteira = true;
        System.out.println(temCarteira);

        // Mini-desafio - trocar valores
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
    }
}