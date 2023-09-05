package com.generation.lojagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_produto")
public class Produto {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY) 
private long id;
	

@NotBlank(message= "O atributo nome é obrigatorio!")
@Size (min= 2, max= 50, message= "O atributo nome deve ter no minimo 2 a 50 caracteres")
private String nome;

@NotBlank(message= "O atributo descrição é obrigatorio!")
@Size (min= 5, max= 500, message= "O atributo descrição deve ter no minimo 5 a 500 caracteres")
private String descricao;

@NotNull(message= "A quantidade é obrigatória")
@Positive(message= "A quantidade deve ser maior que 0")
private int quantidade;

@ManyToOne
@JsonIgnoreProperties("produto")
private Categoria categoria;


    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }

    public int getQuantidade() {
	return quantidade;
    }

    public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
    }

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


}
