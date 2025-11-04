package ex3;

public class DescontoVip implements IDesconto{
    @Override
    public double aplica(double valor) {
        return valor * 0.8;
    }
}
