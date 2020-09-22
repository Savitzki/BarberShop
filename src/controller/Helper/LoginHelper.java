package controller.Helper;

import model.User;
import view.Login;

/**
 *
 * @author Marina Savitzki
 */
public class LoginHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
//Obter modelo do usuario
    public User pullModel(){ 
        String user = view.getUserInput().getText();
        String passwd = String.valueOf(view.getPasswdInput().getPassword());
        
        User model =  new User(0, user, passwd);
        return model;
    }
    
    public void setModel(User model){
        String nome = model.getNome();
        String senha = model.getSenha();
        
        view.getUserInput().setText(nome);
        view.getPasswdInput().setText(senha);
    }
    
//Limpar os componentes da view
    public void clearView(){
        view.getUserInput().setText("");
        view.getPasswdInput().setText("");
    }
}
