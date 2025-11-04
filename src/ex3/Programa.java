package ex3;

public class Programa {
    public static void main(String[] args) {
        CalculaDesconto calculadora = new CalculaDesconto();
        System.out.println("Desconto VIP: " + calculadora.calcular(new DescontoVip(), 100));
        System.out.println("Desconto Regular: " + calculadora.calcular(new DescontoRegular(), 100));
    }
}
