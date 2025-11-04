package ex1;

public class Programa {
    public static void main(String[] args) {
        CadastraUsuario cadastrador = new CadastraUsuario();
        ValidaUsuario validador = new ValidaUsuario();
        EnviaEmail enviador = new EnviaEmail();

        cadastrador.cadastrar("Ana", "ana@email.com");
        enviador.enviarEmailBoasVindas("ana@email.com");
    }
}
