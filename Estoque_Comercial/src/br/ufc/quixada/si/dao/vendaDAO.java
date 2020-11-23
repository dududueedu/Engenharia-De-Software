package br.ufc.quixada.si.dao;
import br.ufc.quixada.si.model.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Edu da Silva
 */
public class vendaDAO {
    private Map <Integer, venda> mapVenda = new  HashMap<>();
    private Connection con;
    private Statement stm;
    
    public vendaDAO(){
        try{
            con = (Connection) ConexaoFactory.getConnection();
            stm = con.createStatement();
            System.out.println(con);
        }catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    } 
    
    public boolean salvar(venda v){        
        /*CallableStatement callableStatement;
        callableStatement = con.prepareCall("{CALL calcula_preco(?, ?)}");
 
			//Informa o tipo de retorno
	callableStatement.registerOutParameter(1, java.sql.Types.DOUBLE);
 
			// Executa a Stored procedure
	callableStatement.execute();
			// Faz a leitura do retorno
	double totalAlunos = callableStatement.getDouble(1);
 
	System.out.println("Total alunos: " + totalAlunos);
        return true;*/
        
        int codV = v.getCodigo_venda();
        int codC = v.getCodigo_cliente();
        int codP = v.getCodigo_produto();
        double valor = (v.getValor()*v.getQtdd());
        int qdt = v.getQtdd();   
        
        try{
            //ResultSet va;
            //va = stm.executeQuery("select calcula_preco("+codP+","+qdt+")");
            stm.executeUpdate("insert into venda values("+codV+","+codC+","+codP+","+valor+","+qdt+")");
            return true;
        }catch(Exception e){
            //e.printStackTrace();
            return false;   
        } 
    }
    
    public Map <Integer, venda> lista_Venda() throws SQLException{
        ResultSet x = stm.executeQuery("Select *from venda");
        
        while(x.next()){
            venda v = new venda();
            v.setCodigo_venda(x.getInt("codigo_venda"));
            v.setCodigo_cliente(x.getInt("codigo_cliente"));
            v.setCodigo_produto(x.getInt("codigo_produto"));
            v.setValor(x.getInt("valor_produto"));
            v.setQtdd(x.getInt("quantidade"));
            //list.add((Informatica)p);
            mapVenda.put(v.getCodigo_venda(), (venda)v);
        }
            return mapVenda;
    }
    
    public boolean excluir(int codigo) throws SQLException {
        
        stm.executeUpdate("delete from venda where codigo_venda="+codigo+"");
        return true;
    }
    public boolean atualizar(venda v, int cod) throws SQLException { 
        try {
            stm.executeUpdate("update venda set codigo_venda="+v.getCodigo_venda()+", codigo_cliente="+v.getCodigo_cliente()+", codigo_produto="+v.getCodigo_produto()+", valor_produto="+v.getValor()+", quantidade="+v.getQtdd()+" where codigo_prod="+cod+"");
            return true;    
        } catch (Exception e) {
            return false;
        }
    }    

    private Statement calcula_preco(int cod, int qnt) throws SQLException {
        stm.executeQuery("select calcula_preco("+cod+","+qnt+")");
        return stm;
    }
}
