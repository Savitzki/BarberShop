package model;

/**
 *
 * @author Marina Savitzki
 */
public class Login {
    
    
    private static String login;

    public Login() {
    }
    
    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        Login.login = login;
    }
    
    
}
