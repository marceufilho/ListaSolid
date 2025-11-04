package ex9;

public class Programa {
    public static void main(String[] args) {
        IRepositorio banco = new BancoDeDados();
        RelatorioService service = new RelatorioService(banco);
        service.gerarRelatorio();
    }
}
