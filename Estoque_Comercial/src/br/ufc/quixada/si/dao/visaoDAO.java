package br.ufc.quixada.si.dao;
import br.ufc.quixada.si.model.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Edu da Silva
 */
public class visaoDAO {

    private Map <Integer, visao> mapVisao = new  HashMap<>();
    private Connection con;
    private Statement stm;
    
    public visaoDAO(){
        try{
            con = (Connection) ConexaoFactory.getConnection();
            stm = con.createStatement();
            System.out.println(con);
        }catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    } 
    
    public Map <Integer, visao> lista_visao() throws SQLException{
        ResultSet x = stm.executeQuery("Select *from contaprodcli, valorT()");
        while(x.next()){
            visao v = new visao();
            v.setContC(x.getInt("quantidade_cliente"));
            v.setContP(x.getInt("quandidade_produto"));
            v.setValorTotalDeVendas(x.getDouble("valort"));
            mapVisao.put(v.getContC(), (visao)v);
        }
            return mapVisao;
    }
}   