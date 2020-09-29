/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package controller.Helper;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.DAO.SchedulingDAO;
import model.Scheduling;
 */
/**
 *
 * @author Marina Savitzki

public class MenuHelper {
    
    private  final Menu menu;

    public MenuHelper(Menu menu) {
        this.menu = menu;
    }
    
    
      public void refreshTableMenu() {
        SchedulingDAO agendamentoDAO = new SchedulingDAO();
        ArrayList<Scheduling> agendamentos = agendamentoDAO.selectAll();

        menu.getListaCliente_tb();

        DefaultTableModel defautlTable = (DefaultTableModel) menu.getListaCliente_tb().getModel();
        defautlTable.setNumRows(0);

        agendamentos.forEach((agendamento) -> {
            defautlTable.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormated(),
                agendamento.getHoraFormated(),
                agendamento.getDataSistema(),
                agendamento.getObservacao()
            });
        });

    }
    
    
}
 */