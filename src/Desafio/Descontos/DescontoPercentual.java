package Desafio.Descontos;

public class DescontoPercentual implements ICalculadoraDesconto {
    private double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double calcularDesconto(double valorOriginal) {
        return valorOriginal * (percentual / 100);
    }
}
