package controller;

import controller.Helper.MenuHelper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import model.login.DadosLogin;
import view.Agenda;
import view.Login;
import view.Menu;
import view.UserList;

/**
 *
 * @author Marina Savitzki
 */
public class MenuController implements ActionListener {

    private final Menu menuPrincipal;
    private final MenuHelper helper;
    DadosLogin dadoLogin = new DadosLogin();

    public MenuController(Menu menu) {
        this.menuPrincipal = menu;
        this.helper = new MenuHelper(menu);
        helper.refreshTableMenu();
        menuPrincipal.getNomeUsuario().setText(dadoLogin.toString());

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
//           Instanciar a tela de usuarios
            UserList userView = new UserList(null, true);
            UserController controller = new UserController(userView);
            userView.setVisible(true);
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
