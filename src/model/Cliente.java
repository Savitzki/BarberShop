package model;

import java.util.Date;


/**
 *
 * @author Marina Savitzki
 */
public class Cliente extends Pessoa{
    

    private String endereco;
    private String cep;

    public Cliente(String endereco, String cep, int id, String nome, char sexo, String email, String dtNascimento, String rg, String telefone) {
        super(id, nome, sexo, email, dtNascimento, rg, telefone);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    



}
