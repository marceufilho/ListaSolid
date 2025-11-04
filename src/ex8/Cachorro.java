package ex8;

public class Cachorro implements IAnda, INada{
    @Override
    public void andar() {
        System.out.println("Andando...");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando...");
    }
}
