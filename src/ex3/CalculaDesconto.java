package ex3;

public class CalculaDesconto {
    public double calcular(IDesconto desconto, double valor){
        return desconto.aplica(valor);
    }
}
