package com.getbook.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;
import java.util.List;


@Entity
@Table (name = "tb_temas")
public class Tema {
	@OneToMany(mappedBy = "tema", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem;

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull (message = "O Atributo id e obrigatorio")
	private Long id;


	
	@NotBlank
	@Size(min = 3, max = 15, message = "O Atributo Genero deve conter no minimo 3 e no maximo 15")
	private String genero; // tipo do texto, poesia lieterari...
	
	@NotBlank
	@Size(min = 3, max = 15, message = "O Atributo Categoria deve conter no minimo 3 e no maximo 15")
	private String categoria; // categoria seria romance cientifico 
	//private String

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
