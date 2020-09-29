package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import view.MenuPrincipal;

/**
 *
 * @author Marina Savitzki
 */
public class MenuPrincipalController implements ActionListener {

    private final MenuPrincipal view;


    public MenuPrincipalController(MenuPrincipal view) {
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
        if (e.getSource() == view.getUserPanel()) {
            view.getUsuarios().setVisible(true);
            view.getAgenda().setVisible(false);
            view.getMain().setVisible(false);
        }
    }

public void buttonMouseEntered(MouseEvent e) {
        if (e.getSource() == view.getClientPanel()) {
            view.getClientPanel().setBackground(new Color(223, 139, 75));
            view.getClientLabel().setForeground(new Color(51, 51, 51));
        } else if (e.getSource() == view.getUserPanel()) {
            view.getUserPanel().setBackground(new Color(223, 139, 75));
            view.getUserLabel().setForeground(new Color(51, 51, 51));
        } else if (e.getSource() == view.getServicePanel()) {
            view.getServicePanel().setBackground(new Color(223, 139, 75));
            view.getServiceLabel().setForeground(new Color(51, 51, 51));
        } else if (e.getSource() == view.getRecordsPanel()) {
            view.getRecordsPanel().setBackground(new Color(223, 139, 75));
            view.getRecordLabel().setForeground(new Color(51, 51, 51));
//            botoes da main
        } else if (e.getSource() == view.getNewButtonMain()) {
            view.getNewButtonMain().setBackground(new Color(223, 139, 75));
            view.getNewButtonMain().setForeground(Color.BLACK);
        } else if (e.getSource() == view.getUpdateButtonMain()) {
            view.getUpdateButtonMain().setBackground(new Color(223, 139, 75));
            view.getUpdateButtonMain().setForeground(Color.BLACK);
//            botoes do footer
        } else if (e.getSource() == view.getExitButtonFooter()) {
            view.getExitButtonFooter().setBackground(new Color(223, 139, 75));
            view.getExitButtonFooter().setForeground(Color.WHITE);
        } else if (e.getSource() == view.getLogoutButtonFooter()) {
            view.getLogoutButtonFooter().setBackground(new Color(223, 139, 75));
            view.getLogoutButtonFooter().setForeground(Color.WHITE);
        }
    }

    public void buttonMouseExited(MouseEvent e) {
        if (e.getSource() == view.getClientPanel()) {
            view.getClientPanel().setBackground(new Color(182, 127, 88));
            view.getClientLabel().setForeground(new Color(255, 255, 255));
        } else if (e.getSource() == view.getServicePanel()) {
            view.getServicePanel().setBackground(new Color(182, 127, 88));
            view.getServiceLabel().setForeground(new Color(255, 255, 255));
        } else if (e.getSource() == view.getUserPanel()) {
            view.getUserPanel().setBackground(new Color(182, 127, 88));
            view.getUserLabel().setForeground(new Color(255, 255, 255));
        } else if (e.getSource() == view.getRecordsPanel()) {
            view.getRecordsPanel().setBackground(new Color(182, 127, 88));
            view.getRecordLabel().setForeground(new Color(255, 255, 255));
//            botoes da main
        } else if (e.getSource() == view.getNewButtonMain()) {
            view.getNewButtonMain().setBackground(new Color(182, 127, 88));
            view.getNewButtonMain().setForeground(new Color(255, 255, 255));
        } else if (e.getSource() == view.getUpdateButtonMain()) {
            view.getUpdateButtonMain().setBackground(new Color(182, 127, 88));
            view.getUpdateButtonMain().setForeground(new Color(255, 255, 255));

        } //botoes do footer
        else if (e.getSource() == view.getExitButtonFooter()) {
            view.getExitButtonFooter().setBackground(new Color(255, 255, 255));
            view.getExitButtonFooter().setForeground(Color.BLACK);
        } else if (e.getSource() == view.getLogoutButtonFooter()) {
            view.getLogoutButtonFooter().setBackground(new Color(255, 255, 255));
            view.getLogoutButtonFooter().setForeground(Color.BLACK);
        }
    }    
}
