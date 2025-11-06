package Desafio;

import Desafio.Descontos.ICalculadoraDesconto;
import Desafio.MetodosDePagamento.IMetodoDePagamento;

public class ProcessadorPedido {
    private ICalculadoraDesconto calculadoraDesconto;
    private IMetodoDePagamento metodoPagamento;

    public ProcessadorPedido(ICalculadoraDesconto calculadoraDesconto, IMetodoDePagamento metodoPagamento) {
        this.calculadoraDesconto = calculadoraDesconto;
        this.metodoPagamento = metodoPagamento;
    }

    public void processar(Pedido pedido) {
        double valorOriginal = pedido.getValorTotal();
        double desconto = calculadoraDesconto.calcularDesconto(valorOriginal);
        double valorFinal = valorOriginal - desconto;

        System.out.println("\n=== Processando Pedido ===");
        System.out.println("Pedido: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Valor original: R$ " + String.format("%.2f", valorOriginal));
        System.out.println("Desconto: R$ " + String.format("%.2f", desconto));
        System.out.println("Valor final: R$ " + String.format("%.2f", valorFinal));

        metodoPagamento.processar(valorFinal);
        System.out.println("Pedido processado com sucesso!\n");
    }
}

