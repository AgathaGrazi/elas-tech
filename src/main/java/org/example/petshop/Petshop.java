package org.example.petshop;

import java.util.*;

public class Petshop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Pet[] cadastro = new Pet[5];

        int opcao = -1;
        int total = 0;

        ArrayDeque<String> fila = new ArrayDeque<>();

        while (opcao != 0) {
            System.out.println();
            System.out.println("=========================");
            System.out.println("=== PETSHOP ===");
            System.out.println("=========================");
            System.out.println("1. Cadastrar Pet");
            System.out.println("2. Listar pets");
            System.out.println("3. Buscar pet");
            System.out.println("4. Listar espécie");
            System.out.println("5. Entrar na fila");
            System.out.println("6. Atender o próximo");
            System.out.println("7. Serviços (Banho - Tosa - Consulta):");
            System.out.println("0. Sair");
            System.out.println("=========================");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        if (total >= cadastro.length) {
                            System.out.println("Limite de pets atingido!");
                            break;
                        }

                        System.out.println("Insira o nome do pet: ");
                        String nome = sc.nextLine();

                        System.out.println("Qual a espécie? ");
                        String especie = sc.nextLine();

                        Pet pet;

                        if (especie.equalsIgnoreCase("Cachorro")){
                            pet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("Gato")) {
                            pet = new Gato();
                        }else {
                            pet = new Pet();
                        }
                        pet.nomeP = nome;
                        pet.especieP = especie;

                        System.out.println("Qual o peso? ");
                        pet.pesoP = sc.nextDouble();
                        sc.nextLine();

                        pet.porte = pet.definirPorte();

                        cadastro[total] = pet;
                        total++;

                        System.out.println("=== FICHA DO PET ===");
                        System.out.printf("Nome: %s - Espécie:  %s - Peso: %.1f Kg - Porte: %s\n", pet.nomeP, pet.especieP, pet.pesoP, pet.porte);

                        System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
                        break;

                    case 2:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado até o momento!");
                        } else {
                            System.out.println("\n=== PETS CADASTRADOS ===");

                            for (int i = 0; i < total; i++) {
                                System.out.printf("Nome: %s - Espécie:  %s - Peso: %.1f Kg - Porte: %s\n",
                                        cadastro[i].nomeP,
                                        cadastro[i].especieP,
                                        cadastro[i].pesoP,
                                        cadastro[i].porte);

                                cadastro[i].emitirSom();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Insira o nome do Pet");
                        String busca = sc.nextLine();
                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (cadastro[i].nomeP.equalsIgnoreCase(busca)) {
                                mostrarFicha(cadastro[i]);
                                System.out.println("---");
                                mostrarFicha(cadastro[i], " FICHA DO PET");

                                achou = true;
                                break;
                            }
                        }
                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;
                    case 4:
                        HashSet<String> especies = new HashSet<>();

                        for (int i = 0; i < total; i++) {
                            especies.add(cadastro[i].especieP.toLowerCase());
                        }
                        System.out.println("\n=== ESPÉCIES CADASTRADAS ===");

                        for (String especieCadastrada : especies){
                            System.out.println(" - " + especieCadastrada);
                        }
                        System.out.println("Total de espécies diferentes: " + especies.size());
                        break;

                    case 5:
                        System.out.println("Nome do pet para entrar na fila: ");

                        String nFila = sc.nextLine();
                        fila.add(nFila);

                        System.out.println(nFila + " entrou na fila.");
                        System.out.println("Fila agora: " + fila);
                        break;
                    case 6:
                        if (fila.isEmpty()) {
                            System.out.println("A fila está vazia.");
                        }else {
                            System.out.println("Próximo da fila: " + fila.peek());
                            String proximo = fila.poll();
                            System.out.println("Atendendo " + proximo + "...");
                            System.out.println("Fila agora: " + fila);}
                        break;
                    case 7:
                        System.out.println(" \n=== SEVIÇOS DISPONÍVEIS ===");
                        System.out.println("Nome do Pet: ");
                        String nomeServico = sc.nextLine();

                        ArrayList<Servico> servicos = new ArrayList<>();

                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        System.out.println("\n=== ESCOLHA O SERVIÇO ===");
                        System.out.println("1. Banho");
                        System.out.println("2. Tosa");
                        System.out.println("3. Consulta");
                        System.out.println("Escolha");

                        int escolhaServico = sc.nextInt();
                        sc.nextLine();

                        if(escolhaServico >= 1 && escolhaServico <= servicos.size()){
                            System.out.println("\n === SERVIÇO EM ANDAMENTO ===");
                        servicos.get(escolhaServico - 1).executar(nomeServico);
                        System.out.println("=========================");
                    }else {
                            System.out.println("Serviço inválido!");
                        }
                        break;
                    case 0: {
                        System.out.println("Até logo!");
                        break;
                    }
                    default: {
                        System.out.println("Opção inválida.");
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("Digitar somente números!");
                sc.nextLine();

            }
                }

                }
                static void mostrarFicha(Pet pet){
                    System.out.println("Nome: " +pet.nomeP);
                }
                static void mostrarFicha(Pet pet, String titulo){
                    System.out.println();
                    System.out.println("=== " + titulo + " ===");
                    System.out.println("Nome: " + pet.nomeP);
                    System.out.println("Espécie: " + pet.especieP);
                    System.out.printf("Peso: %.1f Kg %n", pet.pesoP);
                    System.out.println("Porte: " + pet.porte);
                    System.out.println("=========================");

                }
                }







