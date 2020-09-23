package model;
/**
 *
 * @author Marina Savitzki
 */
public class Client extends Person{
    

    private String endereco;
    private String cep;



    public Client(String endereco, String cep, int id, String nome) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

/**
     *
     * @param id
     * @param nome
     * @param sexo
     * @param email
     * @param dtNascimento
     * @param rg
     * @param telefone
     * @param endereco
     * @param cep
     * Construtores
     */
    public Client(int id, String nome, char sexo, String dtNascimento, String rg, String email, String telefone, String endereco, String cep) {
        super(id, nome, sexo, dtNascimento, rg, email, telefone);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Client(int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    /**
     * Geters e Seters
     * @return 
     */

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

    @Override
    public String toString() {
        return getNome();
    }

    
}
