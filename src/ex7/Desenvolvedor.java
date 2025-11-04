package ex7;

public class Desenvolvedor implements ITrabalhador, IDesevolvedor{
    @Override
    public void trabalhar() {
        System.out.println("Trabalhando...");
    }

    @Override
    public void programar() {
        System.out.println("Programando...");
    }
}
