package Desafio;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class RepositorioCliente {
    private Map<String, Cliente> clientes = new HashMap<>();

    public void cadastrar(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        System.out.println("Cliente cadastrado: " + cliente.getNome());
    }

    public Optional<Cliente> buscarPorId(String id) {
        return Optional.ofNullable(clientes.get(id));
    }
}

