package br.ufc.quixada.si.dao;
import br.ufc.quixada.si.model.produto;
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
public class produtoDAO {
    private Map <Integer, produto> mapProduto = new  HashMap<>();
    private Connection con;
    private Statement stm;
    
    public produtoDAO(){
        try{
            con = (Connection) ConexaoFactory.getConnection();
            stm = con.createStatement();
            System.out.println(con);
        }catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    } 
    
    public boolean salvar(produto prod) {
        String nome = prod.getNome_prod();
        int codigo = prod.getCodigo_prod();
        double preco = prod.getValor();
        int qntd = prod.getQuantidade();
           
        try{
            stm.executeUpdate("insert into produto values("+codigo+",'"+nome+"',"+preco+","+qntd+")");
            return true;
        }catch(Exception e){
            //e.printStackTrace();
            return false;   } 
        
    }
    
    public Map <Integer, produto> lista_Produtos() throws SQLException{
        ResultSet x = stm.executeQuery("Select *from produto");
        
        while(x.next()){
            produto p = new produto();
            p.setCodigo_prod(x.getInt("codigo_prod"));
            p.setNome_prod(x.getString("nome_prod"));
            p.setValor(x.getDouble("valor"));
            p.setQuantidade(x.getInt("quantidade"));
            //list.add((Informatica)p);
            mapProduto.put(p.getCodigo_prod(), (produto)p);
        }
            return mapProduto;
    }
    
    public boolean excluir(int codigo) throws SQLException {
        stm.executeUpdate("delete from produto where codigo_prod="+codigo+"");
        return true;
    }

    public boolean atualizar(produto prod, int cod) throws SQLException { 
        try {
            stm.executeUpdate("update produto set nome_prod='"+prod.getNome_prod()+"', valor="+prod.getValor()+", quantidade="+prod.getQuantidade()+" where codigo_prod="+cod+"");
            return true;    
        } catch (Exception e) {
            return false;
        }
    }    
    
}
