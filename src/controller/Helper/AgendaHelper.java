package controller.Helper;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import model.Scheduling;
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
        
        for (Scheduling agendamento : agendamentos) {
            defautlTable.addRow(new Object[]{
            agendamento.getId(),
            agendamento.getCliente().getNome(),
            agendamento.getServico().getDescricao(),
            agendamento.getValor(),
            agendamento.getDataFormated(),
            agendamento.getHoraFormated(),
            agendamento.getObservacao()
            });
        }
        
    }
    
    
    
}
