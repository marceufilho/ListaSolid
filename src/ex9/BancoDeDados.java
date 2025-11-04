package ex9;

class BancoDeDados implements IRepositorio {
    public void salvar(String dados) {
        System.out.println("Salvando no banco: " + dados);
    }
}
