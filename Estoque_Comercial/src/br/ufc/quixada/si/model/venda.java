package br.ufc.quixada.si.model;
/**
 *  cliente(codigo,nome,cpf), 
    produto(codigo_prod,nome_prod,valor,quantidade), 
    venda(codigo, codigo_prod, valor_prod);
 * @author Edu da Silva
 */
public class venda{
    private int codigo_venda;
    private int codigo_cliente;
    private int codigo_produto;
    private double valor;
    private int qtdd;

    public venda(){}
    public venda(int codigo_venda, int codigo_cliente, int codigo_produto, double valor, int qtdd) {
        this.codigo_venda = codigo_venda;
        this.codigo_cliente = codigo_cliente;
        this.codigo_produto = codigo_produto;
        this.valor = valor;
        this.qtdd = qtdd;
    }

    public int getCodigo_venda() {
        return codigo_venda;
    }

    public void setCodigo_venda(int codigo_venda) {
        this.codigo_venda = codigo_venda;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdd() {
        return qtdd;
    }

    public void setQtdd(int qtdd) {
        this.qtdd = qtdd;
    }
    
    
  
}