/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.Helper.MenuHelper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DAO.SchedulingDAO;
import model.Scheduling;
import view.Agenda;
import view.Login;
import view.Menu;

/**
 *
 * @author Marina Savitzki
 */
public class MenuController implements ActionListener {

    private final Menu menuPrincipal;
    private final MenuHelper helper;

    public MenuController(Menu menu) {
        this.menuPrincipal = menu;
        this.helper = new MenuHelper(menu);
        helper.refreshTableMenu();
    }

    public void goAgenda() {
        Agenda agenda = new Agenda(null, true);
        agenda.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        botoes de gerenciamento
        if (e.getSource() == menuPrincipal.getClientButton()) {
        }
        if (e.getSource() == menuPrincipal.getServiceButton()) {
        }
        if (e.getSource() == menuPrincipal.getUserButton()) {
        }
        if (e.getSource() == menuPrincipal.getReportButton()) {
        }

//        botoes footer da view
        if (e.getSource() == menuPrincipal.getLogoutButton()) {
            int option = JOptionPane.showConfirmDialog(menuPrincipal, "Deseja realmente SAIR?");
//            System.out.println(option);
            if (option == 0) {
                Login login = new Login();
                menuPrincipal.dispose();
                login.setVisible(true);
            }
        }
        if (e.getSource() == menuPrincipal.getHelpButton()) {
        }
        if (e.getSource() == menuPrincipal.getQuitButton()) {
            int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar o sistema?");
            if (op == 0) {
                menuPrincipal.dispose();
                menuPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);

            }
        }

//        botoes agendamento
        if (e.getSource() == menuPrincipal.getNewButton()) {
            goAgenda();
        }
        if (e.getSource() == menuPrincipal.getDeleteButton()) {
        }
        if (e.getSource() == menuPrincipal.getUpdateButton()) {
        }
    }

  

}
