package org.example.aula17;

public class Aula17Main {
    static void main() {
        //Q6
        ContadorVisitas pagina1 = ContadorVisitas.getInstance();
        ContadorVisitas pagina2 = ContadorVisitas.getInstance();

        pagina1.registrarVisita();
        pagina1.registrarVisita();
        pagina2.registrarVisita();
        System.out.println("Total de visitas: " + pagina2.getTotal());

        //Q7
        Carrinho telaProdutos = Carrinho.getInstance();
        Carrinho telaPromocoes = Carrinho.getInstance();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println("Itens no carrinho: " + telaProdutos.getQuantidadeItens());









    }
}
