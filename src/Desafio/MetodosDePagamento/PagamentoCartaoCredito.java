package Desafio.MetodosDePagamento;

public class PagamentoCartaoCredito implements IMetodoDePagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Pagando R$ " + String.format("%.2f", valor) + " no cartão de crédito");
    }
}
