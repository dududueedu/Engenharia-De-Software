package br.ufc.quixada.si.model;
/**
 *  cliente(codigo,nome,cpf), 
    produto(codigo_prod,nome_prod,valor,quantidade), 
    venda(codigo, codigo_prod, valor_prod);
 * @author Edu da Silva
 */
public class produto {
    private int codigo_prod;
    private String nome_prod;
    private double valor;
    private int quantidade;

    public produto(){}
    public produto(int codigo_prod, String nome_prod, double valor, int quantidade) {
        this.codigo_prod = codigo_prod;
        this.nome_prod = nome_prod;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(int codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}