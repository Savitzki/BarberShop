package model;

/**
 *
 * @author Marina Savitzki
 */
public class Service {
    
    private int id;
    private String descricao;
    private float valor;

    public Service(int id, String descricao, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
//geters e seters
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
    
    
    
    
}
