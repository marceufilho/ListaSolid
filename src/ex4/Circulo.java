package ex4;

class Circulo  implements IForma {
    double raio;

    Circulo(double raio) { this.raio = raio; }

    @Override
    public double calcula() {
        return this.raio * this.raio * Math.PI;
    }
}