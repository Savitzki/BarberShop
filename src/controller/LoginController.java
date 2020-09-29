/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.Helper.LoginHelper;
import java.awt.Color;
import java.awt.event.MouseEvent;
import model.DAO.UserDAO;
import model.User;
import model.login.DadosLogin;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author Marina Savitzki
 */
public class LoginController {

    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void logIN() {
        User user = helper.pullModel();
        DadosLogin.setLogin(user.getNome());
        UserDAO userDAO = new UserDAO();
        User usuarioAutenticado = userDAO.selectPorNomeESenha(user);

        if (usuarioAutenticado != null) {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        } else {
            view.message("Usuario ou senha invalidos");
        }

    }

    public void buttonsColorEntered(MouseEvent e) {
        if (e.getSource() == view.getEntrar_bt()) {
            view.getEntrar_bt().setBackground(new Color(0, 120, 215));
            view.getEntrar_bt().setForeground(new Color(255, 255, 255));
        } else if (e.getSource() == view.getCancelButton()) {
            view.getCancelButton().setBackground(new Color(255, 71, 71));
            view.getCancelButton().setForeground(new Color(255, 255, 255));
        }
    }

//    [51,51,51]
    public void buttonColorExited(MouseEvent e) {
        if (e.getSource() == view.getEntrar_bt()) {
            view.getEntrar_bt().setBackground(new Color(237, 237, 237));
            view.getEntrar_bt().setForeground(new Color(51, 51, 51));
        } else if (e.getSource() == view.getCancelButton()) {
            view.getCancelButton().setBackground(new Color(237, 237, 237));
            view.getCancelButton().setForeground(new Color(51, 51, 51));
        }
    }

}
