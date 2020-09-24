/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.Helper.LoginHelper;
import java.awt.event.KeyEvent;
import model.DAO.UserDAO;
import model.User;
import view.Login;
import view.Menu;

/**
 *
 * @author Marina Savitzki
 */
public class LoginController {
    
    private final Login view;
    private final LoginHelper helper;
    private static String login;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void logIN(){
        User user = helper.pullModel();
        
        UserDAO userDAO = new UserDAO();
        login = user.getNome();
        User usuarioAutenticado = userDAO.selectPorNomeESenha(user);
        
        if(usuarioAutenticado != null){
            Menu menu = new Menu();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.message("Usuario ou senha invalidos");
        }
            
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        LoginController.login = login;
    }
    
    
}
