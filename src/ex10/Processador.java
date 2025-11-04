package ex10;

public class Processador {
    private ILeitor leitor;

    public Processador(ILeitor leitor) {
        this.leitor = leitor;
    }

    public void processar() {
        System.out.println(leitor.ler());
    }
}
