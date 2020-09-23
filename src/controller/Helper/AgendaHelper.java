package controller.Helper;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Client;
import model.Scheduling;
import model.Service;
import view.Agenda;

/**
 *
 * @author Marina Savitzki
 */
public class AgendaHelper {
    
    private final Agenda viewAgenda;

    /**
     * 
     * @param viewAgenda 
     */
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

    public Service getService() {
        return (Service) viewAgenda.getServico_cb().getSelectedItem();
    }

    public void setValue(float valor) {
        viewAgenda.getValorTf().setText(valor + "") ;
        
    }
    
    
    
}
