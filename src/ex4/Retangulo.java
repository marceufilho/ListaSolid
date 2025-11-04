package ex4;

class Retangulo implements IForma {
    double largura, altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcula() {
        return this.altura * this.altura;
    }
}