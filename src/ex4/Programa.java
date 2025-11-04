package ex4;

import ex3.CalculaDesconto;

public class Programa {
    public static void main(String[] args) {
        CalculadoraDeArea calculadora = new CalculadoraDeArea();

        System.out.println("Área do círculo: " + calculadora.calculaArea(new Circulo(5)));
        System.out.println("Área do retângulo: " + calculadora.calculaArea(new Retangulo(4, 6)));
    }
}
