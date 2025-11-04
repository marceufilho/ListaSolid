package ex10;

public class Programa {
    public static void main(String[] args) {
        ILeitor leitor = new LeitorArquivo();
        Processador p = new Processador(leitor);
        p.processar();
    }
}
