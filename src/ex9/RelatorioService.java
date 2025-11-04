package ex9;

class RelatorioService {
    private IRepositorio repositorio;

    public RelatorioService(IRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void gerarRelatorio() {
        repositorio.salvar("Relatório de vendas");
    }
}