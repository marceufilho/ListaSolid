package ex2;

public class Programa {
    public static void main(String[] args) {
        GeradorDeRelatorio gerador = new GeradorDeRelatorio();
        SalvadorRelatorio salvador = new SalvadorRelatorio();

        gerador.gerar();
        salvador.salvar();
    }
}
