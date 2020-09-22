package model;

/**
 *
 * @author Marina Savitzki
 */
public class User extends Person{
    
    private String senha;
    private String nivelDeAcesso;

    public User(String senha, String nivelDeAcesso, int id, String nome) {
        super(id, nome);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public User(int id, String nome, char sexo ,String dtNascimento, String email , String rg, String telefone,String senha, String nivelDeAcesso ) {
        super(id, nome, sexo, email, dtNascimento, rg, telefone);
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
