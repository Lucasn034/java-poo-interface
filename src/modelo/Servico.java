package modelo;

public class Servico implements Vendavel {

    private String nomeServico;
    private double precoServico;
    private int porcentagemDesonto;
    private int valorFinal;

    public Servico (String nomeServico, double precoServico, int porcentagemDesconto){
        this.nomeServico = nomeServico;
        this.precoServico = precoServico;
        this.porcentagemDesonto = porcentagemDesconto;
    }

    @Override
    public void calculaPrecoFinal(int quantidade) {
        double valor = precoServico * quantidade;
        int desconto = ((int) valor * porcentagemDesonto) / 100;
        valorFinal = (int) valor - desconto;

        System.out.println("Valor Total do Serviço = R$ " + valor);
        System.out.println("Desconto Aplicado = " + porcentagemDesonto + " % ");
        System.out.println("Valor Final = R$ " + valorFinal + "\n");
    }
}
