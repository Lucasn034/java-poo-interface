package principal;

import modelo.Produto;
import modelo.Servico;

public class Principal {
    public static void main(String[] args) {
        Servico servico = new Servico("Manutenção Elétrica", 100, 50);
        servico.calculaPrecoFinal(3);

        Produto produto = new Produto("Fone", 12);
        produto.calculaPrecoFinal(3);

        Produto novoProduto = new Produto("Camiseta", 25);
        novoProduto.calculaPrecoFinal(2);

        Produto outroProduto = new Produto("Calça", 60);
        outroProduto.calculaPrecoFinal(1);

    }
}
