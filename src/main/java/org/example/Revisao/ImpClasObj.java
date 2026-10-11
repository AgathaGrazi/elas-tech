package org.example.Revisao;

public class ImpClasObj {
    static void main() {
        // 1 e 2 - dois pets
        Pet pet1 = new Pet();
        pet1.nome = "Thor";
        pet1.raca = "Labrador";
        pet1.peso = 20.5;

        Pet pet2 = new Pet();
        pet2.nome = "Haj";
        pet2.raca = "Siamês";
        pet2.peso = 6.2;

        System.out.printf("Pet: %s | Raça: %s | Peso: %.1f kg%n", pet1.nome, pet1.raca, pet1.peso);
        System.out.printf("Pet: %s | Raça: %s | Peso: %.1f kg%n", pet2.nome, pet2.raca, pet2.peso);

        // 3 - produto e valor em estoque
        Produto produto = new Produto();
        produto.nome = "Aliança";
        produto.preco = 1500.50;
        produto.quantidade = 2;
        double totalEstoque = produto.preco * produto.quantidade;
        System.out.printf("%s: R$ %.2f em estoque%n", produto.nome, totalEstoque);

        // 4 - aluna com média
        Aluna aluna = new Aluna();
        aluna.nome = "Giulia";
        aluna.nota1 = 8.0;
        aluna.nota2 = 6.5;
        aluna.media = (aluna.nota1 + aluna.nota2) / 2;
        System.out.println("=== FICHA DA ALUNA ===");
        System.out.println("Nome: " + aluna.nome);
        System.out.printf("Notas: %.1f e %.1f%n", aluna.nota1, aluna.nota2);
        System.out.printf("Média: %.2f%n", aluna.media);

        // Mini-desafio - jogadora com mais pontos
        Jogadora j1 = new Jogadora();
        j1.nome = "Roberta";
        j1.pontos = 18;

        Jogadora j2 = new Jogadora();
        j2.nome = "Marta";
        j2.pontos = 25;

        Jogadora j3 = new Jogadora();
        j3.nome = "Hortência";
        j3.pontos = 12;

        String melhorNome = j1.nome;
        int melhorPontos = j1.pontos;

        if (j2.pontos > melhorPontos) {
            melhorNome = j2.nome;
            melhorPontos = j2.pontos;
        }
        if (j3.pontos > melhorPontos) {
            melhorNome = j3.nome;
            melhorPontos = j3.pontos;
        }
        System.out.println("Maior pontuação: " + melhorNome);
    }
}


