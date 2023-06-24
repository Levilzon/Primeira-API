package br.com.projeto.api.entidades;

public class Departamento {
    private long id;
    private String nome;

    public Departamento(){

    }

    public Departamento(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
