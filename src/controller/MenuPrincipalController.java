package controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
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
//
//        if (e.getSource() == view.getCancelButtonAgenda()) {
//            view.getMain().setVisible(true);
//            view.getAgenda().setVisible(false);
//        }
//        if (e.getSource() == view.getNewButton()) {
//            view.getMain().setVisible(false);
//            view.getAgenda().setVisible(true);
//        }
        if (e.getSource() == view.getExitButtonFooter()) {
            view.dispose();
            view.setDefaultCloseOperation(0);
        }
//        if (e.getSource() == view.getHomeButtonUser() || e.getSource() == view.getHomeButtonAgenda()) {
//            view.getUsuarios().setVisible(false);
//            view.getAgenda().setVisible(false);
//            view.getMain().setVisible(true);
//        }
    }
//Controller dos botoes laterais do menuPrincipal

//    public void visibleView(MouseEvent e) {
//        if (e.getSource() == view.getUserPanel()) {
//            view.getUsuarios().setVisible(true);
//            view.getAgenda().setVisible(false);
//            view.getMain().setVisible(false);
//        }
//    }

    public void buttonMouseEntered(MouseEvent e) {
//            botoes da main
        if (e.getSource() == view.getNewButtonMain()) {
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
//            botoes da main
        if (e.getSource() == view.getNewButtonMain()) {
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

    public void paintComponentsMouseEntered(JPanel[] panels, MouseEvent evt) {
        for (JPanel panel : panels) {
            if (evt.getSource() == panel) {
                panel.setBackground(new Color(191, 138, 100));
            }
        }

    }

    //Chamado quando o componente não possui o mouse em cima.
    public void paintComponentsMouseExited(JPanel[] panels, MouseEvent evt) {
        for (JPanel panel : panels) {
            if (evt.getSource() == panel) {
                panel.setBackground(new Color(182, 127, 88));
            }
        }
    }

    public void styleComponentsLeftMenu(JPanel[] panels, JPanel[] secPanels, MouseEvent evt, JPanel internPanel) {
        Component component = evt.getComponent();
        component.setBackground(new Color(191, 138, 100));
        internPanel.setOpaque(true);
        for (JPanel panel : panels) {
            panel.setBackground(new Color(182, 127, 88));
        }
        for (JPanel secPanel : secPanels) {
            secPanel.setOpaque(false);
        }
    }

}