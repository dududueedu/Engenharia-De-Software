package br.ufc.quixada.si.model;
/**
 *  cliente(codigo,nome,cpf), 
    produto(codigo_prod,nome_prod,valor,quantidade), 
    venda(codigo, codigo_prod, valor_prod);
 * @author Edu da Silva
 */
public class cliente {
    private int codigo;
    private String nome;
    private String cpf;
    
    public cliente(){}
    public cliente(int codigo, String nome, String cpf){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}