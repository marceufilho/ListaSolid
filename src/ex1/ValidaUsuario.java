package ex1;

public class ValidaUsuario {
    public boolean validarSenha(String senha) {
        return senha.length() >= 8;
    }
}
