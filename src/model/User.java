package model;

/**
 *
 * @author Marina Savitzki
 */
public class User extends Person{
    
    private String senha;
    private String nivelDeAcesso;

    public User( int id, String nome, char sexo, String dtNascimento, String rg, String email, String telefone, String senha, String nivelDeAcesso) {
        super(id, nome, sexo, dtNascimento, rg, email, telefone);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public User(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }
    
}
