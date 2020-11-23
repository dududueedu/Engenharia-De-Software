package br.ufc.quixada.si.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author EDUARDO
 */
public class ConexaoFactory {
    private static Connection con;
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if(con == null){
            Class.forName("org.postgresql.Driver");
                String url = "jdbc:postgresql://localhost:5432/fbdestoque";
                String user = "postgres";
                String pass = "182123";
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Conectado!");
                return con;
        }else{
                return con;
       }
    }
}