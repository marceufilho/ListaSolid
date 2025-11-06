package Desafio;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class RepositorioPedido {
    private Map<String, Pedido> pedidos = new HashMap<>();

    public void salvar(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
        System.out.println("Pedido salvo: " + pedido.getId());
    }

    public Optional<Pedido> buscarPorId(String id) {
        return Optional.ofNullable(pedidos.get(id));
    }
}
