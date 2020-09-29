package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import view.MenuTeste;

/**
 *
 * @author Marina Savitzki
 */
public class MenuTesteController implements ActionListener {

    private final MenuTeste view;

    public MenuTesteController(MenuTeste view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.getCancelButtonAgenda()) {
            view.getMain().setVisible(true);
            view.getAgenda().setVisible(false);
        }
        if (e.getSource() == view.getNewButton()) {
            view.getMain().setVisible(false);
            view.getAgenda().setVisible(true);
        }
        if (e.getSource() == view.getExitButtonFooter()) {
            view.dispose();
            view.setDefaultCloseOperation(0);
        }
        if (e.getSource() == view.getHomeButtonUser() || e.getSource() == view.getHomeButtonAgenda()) {
            view.getUsuarios().setVisible(false);
            view.getAgenda().setVisible(false);
            view.getMain().setVisible(true);
        }
    }
//Controller dos botoes laterais do menuPrincipal
    public void visibleView(MouseEvent e) {
        if(e.getSource() == view.getUserPanel()){
            view.getUsuarios().setVisible(true);
            view.getAgenda().setVisible(false);
            view.getMain().setVisible(false);
        }
        
    }

}
