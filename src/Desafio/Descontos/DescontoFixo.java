package Desafio.Descontos;

public class DescontoFixo implements ICalculadoraDesconto {
    private double valorDesconto;

    public DescontoFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double calcularDesconto(double valorOriginal) {
        return Math.min(valorDesconto, valorOriginal);
    }

}
