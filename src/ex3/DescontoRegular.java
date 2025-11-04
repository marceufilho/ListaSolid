package ex3;

public class DescontoRegular implements IDesconto{
    @Override
    public double aplica(double valor) {
        return valor * 0.9;
    }
}
