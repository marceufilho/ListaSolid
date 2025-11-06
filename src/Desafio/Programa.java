package Desafio;

import Desafio.Descontos.DescontoFixo;
import Desafio.Descontos.DescontoPercentual;
import Desafio.Descontos.SemDesconto;
import Desafio.MetodosDePagamento.PagamentoBoleto;
import Desafio.MetodosDePagamento.PagamentoCartaoCredito;
import Desafio.MetodosDePagamento.PagamentoPix;

public class Programa {
    public static void main(String[] args) {
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        RepositorioPedido repositorioPedido = new RepositorioPedido();


        Cliente cliente1 = new Cliente("1", "João Silva", "joao@email.com");
        Cliente cliente2 = new Cliente("2", "Maria Santos", "maria@email.com");

        repositorioCliente.cadastrar(cliente1);
        repositorioCliente.cadastrar(cliente2);

        System.out.println("\n--- Criando Pedidos ---\n");


        Pedido pedido1 = new Pedido("PED001", cliente1);
        pedido1.adicionarItem(new ItemPedido("Notebook", 1, 3000.00));
        pedido1.adicionarItem(new ItemPedido("Mouse", 2, 50.00));
        repositorioPedido.salvar(pedido1);


        Pedido pedido2 = new Pedido("PED002", cliente2);
        pedido2.adicionarItem(new ItemPedido("Teclado", 1, 200.00));
        pedido2.adicionarItem(new ItemPedido("Monitor", 1, 800.00));
        repositorioPedido.salvar(pedido2);


        Pedido pedido3 = new Pedido("PED003", cliente1);
        pedido3.adicionarItem(new ItemPedido("Webcam", 1, 300.00));
        repositorioPedido.salvar(pedido3);

        System.out.println("\n--- Processando Pedidos ---");


        ProcessadorPedido processador1 = new ProcessadorPedido(
                new SemDesconto(),
                new PagamentoCartaoCredito()
        );
        processador1.processar(pedido1);


        ProcessadorPedido processador2 = new ProcessadorPedido(
                new DescontoPercentual(10),
                new PagamentoBoleto()
        );
        processador2.processar(pedido2);


        ProcessadorPedido processador3 = new ProcessadorPedido(
                new DescontoFixo(50),
                new PagamentoPix()
        );
        processador3.processar(pedido3);

    }

}
