package controller;

import controller.Helper.AgendaHelper;
import java.util.ArrayList;
import model.DAO.SchedulingDAO;
import model.Scheduling;
import view.Agenda;

/**
 *
 * @author Marina Savitzki
 */
public class AgendaController {
    
    private final Agenda viewAgenda;
    private final AgendaHelper helper;

    public AgendaController(Agenda viewAgenda) {
        this.viewAgenda = viewAgenda;
        this.helper = new AgendaHelper(viewAgenda);
    }
    
    public void refreshTable(){
        
        SchedulingDAO agendamentoDAO = new SchedulingDAO();
        ArrayList<Scheduling> agendamentos = agendamentoDAO.selectAll();
        
//        preencher tabela
        helper.fillTable(agendamentos);
    }

    
}
