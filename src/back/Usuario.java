package back;

public class Usuario {

    private String login;
    private String senha;

    public Usuario(String nome, String senha) {
        this.login = nome;
        this.senha = senha;
    }

    // Getters e Setters
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean consultar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    @Override // utilização do Polimorfismo de Sobreposição, exibe no console os dados do usuário
    public String toString() {
        return "Usuario{" + "login=" + login + ", senha=" + senha + '}';
    }
}
