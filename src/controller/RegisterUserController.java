package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DAO.Conection;
import view.NewUser;

/**
 *
 * @author Marina Savitzki
 */
public class RegisterUserController implements ActionListener {

    private final NewUser view;

    public RegisterUserController(NewUser view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.getRegisterUserButton()) {
            if (view.getUserName1().getText().equals(view.getUserNameConfirm().getText())
                    && new String(view.getUserPassword1().getPassword()).equals(new String(view.getUserPasswordConfirm().getPassword()))) {
//                System.out.println(view.getUserName1().getText().equals(view.getUserNameConfirm().getText()));
//                System.out.println(new String(view.getUserPassword1().getPassword()).equals(new String(view.getUserPasswordConfirm().getPassword())));
                try {
                    //                conectar ao BD
                    Connection conn = new Conection().getConnection();
                    /**
                     * Pegando nome e senha do usuario para registrar no banco
                     */
                    String name = view.getUserNameConfirm().getText();
                    String password = String.valueOf(view.getUserPasswordConfirm().getPassword());

                    //String contendo o SQL para executar no banco
                    /**
                     * possiveis erros nome da tabela errada, parametros no
                     * value, aspas, concacetação errada
                     */
                    String SQL = "INSERT INTO tb_user(user_name, user_password) VALUES('" + name + "', '" + password + "');";

                    // Preparar o sql para enviar
                    PreparedStatement statement = conn.prepareStatement(SQL);
                    statement.execute();

                    //fecha conexao
                    conn.close();

                    Object[] options = {"Ok", "Cancelar"};
                    JOptionPane.showOptionDialog(null, "Seu cadastro foi realizado com sucesso\n Clique em OK para continuar", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, options, options[0]
                    );
                     
                        this.view.dispose();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(RegisterUserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Opa, parece que seus dados não são iguais\n Verfique e corrija", "Corrija seus dados", 0);
            }

        }
        if (e.getSource() == view.getCancelRegisterUserButton()) {
            view.dispose();
        }
    }

}
