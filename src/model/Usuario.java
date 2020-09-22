package model;

/**
 *
 * @author Marina Savitzki
 */
public class Usuario extends Pessoa{
    
    private String senha;
    private String nivelDeAcesso;

    public Usuario( int id, String nome, String senha, String nivelDeAcesso) {
        super(id, nome);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public Usuario(int id, String nome, String senha) {
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