package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.NewUser;
import view.UserList;

/**
 *
 * @author Marina Savitzki
 */
public class UserController implements ActionListener{

    private final UserList view;

    public UserController(UserList view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == view.getNewUserButton()){
            
            NewUser viewUser = new NewUser(null, true);
            RegisterUserController userRegister = new RegisterUserController(viewUser);
            viewUser.setVisible(true);
            
        }
        
        if(e.getSource() == view.getDeleteUserButton()){}
        if(e.getSource() == view.getUpdateUserButton()){}
    }
}
