package br.com.projeto.api.entidades;

public class Produto{
    private Long id;
    private String nome;
    private Double preco;
    private Departamento departamento;

    public Produto(){

    }

    public Produto(Long id, String nome, Double preco, Departamento departamento){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.departamento = departamento;
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

    public Double getPreco(){
        return this.preco;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public Departamento getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
    
}
