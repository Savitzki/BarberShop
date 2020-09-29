/**
package controller.Helper;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Client;
import model.Scheduling;
import model.Service;
import view.Agenda;

/**
 *
 * @author Marina Savitzki

public class AgendaHelper implements InterfaceHelper{
    
    private final Agenda viewAgenda;

    /**
     * 
     * @param viewAgenda 
     
    public AgendaHelper(Agenda viewAgenda) {
        this.viewAgenda = viewAgenda;
    }

//preenchendo a tabela
    public void fillTable(ArrayList<Scheduling> agendamentos) {
        viewAgenda.getListaCliente_tb();
        
        DefaultTableModel defautlTable = (DefaultTableModel) viewAgenda.getListaCliente_tb().getModel();
        defautlTable.setNumRows(0);
        
        agendamentos.forEach((agendamento) -> {
            defautlTable.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormated(),
                agendamento.getHoraFormated(),
                agendamento.getObservacao()
            });
        });
        
    }

    public void fillClients(ArrayList<Client> clients) {
         DefaultComboBoxModel comboBoxMOdel = (DefaultComboBoxModel) viewAgenda.getCliente_cb().getModel();
         
         clients.forEach((client) -> {
             comboBoxMOdel.addElement(client);
        });
    }

    public void fillService(ArrayList<Service> services) {
        DefaultComboBoxModel comboBoxMOdel = (DefaultComboBoxModel) viewAgenda.getServico_cb().getModel();
         
        services.forEach((service) -> {
            comboBoxMOdel.addElement(service);
        });
        
    }

    public Client getClient() {
        return (Client) viewAgenda.getCliente_cb().getSelectedItem();
    }
    
    public Service getService() {
        return (Service) viewAgenda.getServico_cb().getSelectedItem();
    }

    public void setValue(float valor) {
        viewAgenda.getValorTf().setText(valor + "") ;
        
    }

    @Override
    public Scheduling getModel() {
        String idString = viewAgenda.getId_tf().getText();
        int id = Integer.parseInt(idString);
        Client client = getClient();
        Service service = getService();
        String valorString = viewAgenda.getValorTf().getText();
        float valor = Float.parseFloat(valorString);
        String data = viewAgenda.getDataFtf().getText();
        String hora = viewAgenda.getHora_ftf().getText();
        String dataHora = data +" "+ hora;
        Date dataSis = new Date();
        String obs = viewAgenda.getObservTxtArea().getText();
        
        Scheduling agendamento = new Scheduling(id, client, service, valor, dataHora,dataSis, obs);
        return agendamento;
    }

    @Override
    public void clearView() {
        viewAgenda.getId_tf().setText("0");
        viewAgenda.getDataFtf().setText("");
        viewAgenda.getHora_ftf().setText("");
        viewAgenda.getObservTxtArea().setText("");
    }
    
    
    
}
*/