package br.ufc.quixada.si.model;
/**
 *  size = 690/530;
 * @author Eduardo
 */
public class usuario {
    private String nome;
    private int senha;

    public usuario(){}
    public usuario(String nome, int senha){
        this.nome = nome;
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}