package model.login;

/**
 *
 * @author Marina Savitzki
 */
public class DadosLogin {
    
    
    private static String login;

    public DadosLogin() {
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        DadosLogin.login = login;
    }

    @Override
    public String toString() {
        return getLogin();
    }

    
    
}
