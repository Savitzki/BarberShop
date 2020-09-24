package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marina Savitzki
 */
public class Scheduling {
    
    private int id;
    private Client cliente;
    private Service servico;
    private float valor;
    private Date data;
    private String observacao;
    private Date dataSistema;

    public Scheduling(int id, Client cliente, Service servico, float valor, String data, Date dataSistema) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Scheduling.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dataSistema = dataSistema;
    }

    public Scheduling(int id, Client cliente, Service servico, float valor, String data, Date dataSistema, String observacao) {
        this(id, cliente, servico, valor, data, dataSistema);
        this.observacao = observacao;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public Service getServico() {
        return servico;
    }

    public void setServico(Service servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public String getDataSistema() {
        return new SimpleDateFormat("dd/MM/yyy HH:mm:ss").format(dataSistema);
    }

    public void setDataSistema(Date dataSistema) {
        this.dataSistema = dataSistema;
    }
    
//    data formatada
    public String getDataFormated(){
        return new SimpleDateFormat("dd/MM/yyy").format(data);
    }
    
//    hora formatada
    public String getHoraFormated(){
        return new SimpleDateFormat("HH:mm").format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
    
}
