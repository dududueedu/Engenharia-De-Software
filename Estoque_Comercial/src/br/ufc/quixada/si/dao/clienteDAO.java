package br.ufc.quixada.si.dao;
import br.ufc.quixada.si.model.cliente;
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
public class clienteDAO {
    private Map <Integer, cliente> mapCliente = new  HashMap<>();
    private Connection con;
    private Statement stm;
    
    public clienteDAO(){
        try{
            con = (Connection) ConexaoFactory.getConnection();
            stm = con.createStatement();
            System.out.println(con);
        }catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    } 
    
    public boolean salvar(cliente c) {
        
        String nome = c.getNome();
        int codigo = c.getCodigo();
        String cpf = c.getCpf();
           
        try{
            stm.executeUpdate("insert into cliente values("+codigo+",'"+nome+"','"+cpf+"')");
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;   }  
        
    }
    
    public Map <Integer, cliente> lista_Clientes() throws SQLException{
        ResultSet x = stm.executeQuery("Select *from cliente");
        
        while(x.next()){
            
            cliente c = new cliente();
            c.setNome (x.getString("nome"));
            c.setCodigo(x.getInt("codigo"));
            c.setCpf(x.getString("cpf"));
            //list.add((Informatica)p);
            mapCliente.put(c.getCodigo(), (cliente)c);
        }
            return mapCliente;
    }
    
    public boolean excluir(int codigo) throws SQLException {
        stm.executeUpdate("delete from cliente where codigo="+codigo+"");
        return true;
    }

    public boolean atualizar(cliente c, int cod) throws SQLException {
        stm.executeUpdate("update cliente set nome='"+c.getNome()+"', cpf='"+c.getCpf()+"' where codigo="+cod+"");
        return true;    
    }
}
