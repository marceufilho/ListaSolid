package Desafio.MetodosDePagamento;

public class PagamentoBoleto implements IMetodoDePagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Pagando R$ " + String.format("%.2f", valor) + " no boleto");
    }
}
