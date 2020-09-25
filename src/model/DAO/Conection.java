package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Marina Savitzki
 */
public class Conection {
    
    public Connection getConnection() throws SQLException{
        /**
         * Conexao com o banco de dados do postgreSQL
         * parametros: link da conexao, usuario e senha do servidor do banco de dados
         */
        Connection conn = DriverManager.getConnection("jdbc:postgresql:localhost:5432/barbershop", "postgres", "postgres");
        return conn;
        
    }
    
}
