package modelo;

import java.security.PublicKey;

public class Produto implements Vendavel {

    private String nome;
    private int desconto;
    private double precoUnitario;
    private double precoFinal;
    private double calculaDesconto;

    public Produto(String nome, double precoUnitario){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public void calculaPrecoFinal(int quantidade) {

        precoFinal = precoUnitario * quantidade;

        if(quantidade >= 3){
            desconto = 50;
            calculaDesconto = (precoFinal * desconto) / 100;
            precoFinal -= calculaDesconto;

            System.out.println("Produto = " + nome);
            System.out.println("Desconto = 50% \nPreço Final do Produto = R$ " + precoFinal + "\n");

        } else if(quantidade == 2) {
            desconto = 10;
            calculaDesconto = (precoFinal * desconto) / 100;
            precoFinal -= calculaDesconto;

            System.out.println("Produto = " + nome);
            System.out.println("Desconto = 10%\nPreço Final do Produto = R$ " + precoFinal + "\n");

        }else {
            System.out.println("Você não tem direito ao desconto!\nPreço Final = R$" + precoFinal + "\n");
        }
    }
}
