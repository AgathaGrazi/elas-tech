package org.example.aula17;

public class Carrinho {
    private static Carrinho instancia;
    private int quantidadeItens = 0;

    public void adicionarItem(){
        quantidadeItens++;}

    public int getQuantidadeItens() {
        return quantidadeItens;}

    private Carrinho() {
    }

    public static Carrinho getInstance(){
        if (instancia == null) {
            instancia = new Carrinho();
        }
        return instancia;
    }
}
