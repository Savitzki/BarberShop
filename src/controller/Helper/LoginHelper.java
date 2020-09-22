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
        String user = view.getJtf_user().getText();
        String passwd = view.getJp_password().getText();
        
        User model =  new User(0, user, passwd);
        return model;
    }
    
    public void setModel(User model){
        String nome = model.getNome();
        String senha = model.getSenha();
        
        view.getJtf_user().setText(nome);
        view.getJp_password().setText(senha);
    }
    
//Limpar os componentes da view
    public void clearView(){
        view.getJtf_user().setText("");
        view.getJp_password().setText("");
    }
}
