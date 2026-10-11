package org.example.Revisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuFilmes {
    static String classificar(double nota) {
        if (nota >= 8) {
            return "Ótimo";
        } else if (nota >= 5) {
            return "Bom";
        } else {
            return "Ruim";
        }}

    static void main() {
        Scanner sc = new Scanner(System.in);
        Filme[] filmes = new Filme[5];
        int total = 0;
        int opcao = 0;

        while (opcao != 5) {
            System.out.println();
            System.out.println("=== MEU CATÁLOGO ===");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Buscar por título");
            System.out.println("4 - Estatísticas");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1: {
                        if (total == filmes.length) {
                            System.out.println("Catalogo cheio!");
                            break;

                        }
                        Filme filme1 = new Filme();
                        System.out.print("Digite o título: ");
                        filme1.titulo = sc.nextLine();
                        System.out.println("Informe o gênero: ");
                        filme1.genero = sc.nextLine().toUpperCase();
                        System.out.println("Dê uma nota de 0 a 10: ");
                        filme1.nota = sc.nextDouble();
                        sc.nextLine();
                        filme1.classificacao = classificar(filme1.nota);

                        filmes[total] = filme1;
                        total++;
                        System.out.println("Filme cadastrado!");
                        break;
                    }
                    case 2: {
                        if (total == 0) {
                            System.out.println("Nenhum filme cadastrado");
                            break;
                        }
                        for (int i = 0; i < total; i++) {
                            System.out.printf("%s [%s] - Nota %.1f - %s%n",
                                    filmes[i].titulo, filmes[i].genero,
                                    filmes[i].nota, filmes[i].classificacao);
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Título: ");
                        String busca = sc.nextLine();
                        int posicao = -1;
                        for (int i = 0; i < total; i++) {
                            if (filmes[i].titulo.equalsIgnoreCase(busca)) {
                                posicao = i;
                                break;
                            }
                        }
                        if (posicao == -1) {
                            System.out.println("Filme não localizado.");
                        } else {
                            System.out.printf("%s [%s] - Nota %.1f - %s%n",
                                    filmes[posicao].titulo, filmes[posicao].genero,
                                    filmes[posicao].nota, filmes[posicao].classificacao);
                        }
                        break;
                    }
                    case 4: {
                        if (total == 0) {
                            System.out.println("Nenhum filme cadastrado!");
                            break;
                        }
                        double soma = 0;
                        int posicaoMe = 0;
                        int otimos = 0;
                        for (int i = 0; i < total; i++)
                        {
                            soma += filmes[i].nota;
                            if (filmes[i].nota > filmes[posicaoMe].nota) {
                                posicaoMe = i;
                            }
                            if (filmes[i].classificacao.equals("Ótimo")) {
                                otimos++;
                            }
                        }
                        System.out.println("Total de filmes: " + total);
                        System.out.printf("Média das notas: %.2f%n", soma / total);
                        System.out.println("Melhor filme: " + filmes[posicaoMe].titulo);
                        System.out.println("Filmes ótimos: " + otimos + " de " + total);
                        break;
                    }
                    case 5: {
                        System.out.println("Bons filme!");
                        break;
                    }
                    default:
                        System.out.println("Opção inválida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
                opcao = 0;
            }
        }









            }
        }




