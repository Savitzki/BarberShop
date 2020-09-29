/**
package controller;

import controller.Helper.AgendaHelper;
import java.util.ArrayList;
import model.Client;
import model.DAO.ClientDAO;
import model.DAO.SchedulingDAO;
import model.DAO.ServiceDAO;
import model.Scheduling;
import model.Service;
import view.Agenda;

/**
 *
 * @author Marina Savitzki
 
public class SchedulingController {
    
    private final Agenda viewAgenda;
    private final AgendaHelper helper;

    public SchedulingController(Agenda viewAgenda) {
        this.viewAgenda = viewAgenda;
        this.helper = new AgendaHelper(viewAgenda);
    }
  
    public void refreshTable(){
        
        SchedulingDAO agendamentoDAO = new SchedulingDAO();
        ArrayList<Scheduling> agendamentos = agendamentoDAO.selectAll();
        
//        preencher tabela
        helper.fillTable(agendamentos);
    }
/**
 * Atualizando comboBox de clientes da tela agenda

    public void refreshClient(){
        ClientDAO clientDAO = new ClientDAO();
        ArrayList<Client> clients = clientDAO.selectAll();
        
//        preenchendo o comboBox
        helper.fillClients(clients);
    }
    public void refreshService(){
        
        ServiceDAO serviceDAO = new ServiceDAO();
        ArrayList<Service> services = serviceDAO.selectAll();
        
        helper.fillService(services);
    }
    
    public void refreshValue(){
        Service service = helper.getService();
        
        helper.setValue(service.getValor());
    }
        
    
    public void schedule(){
        Scheduling agendamento = helper.getModel();
        new SchedulingDAO().insert(agendamento);
        
//        Correio newCorreio = new Correio();
//        newCorreio.notifyEmail(agendamento);
        
        refreshTable();
        helper.clearView();
    }
    
}
*/