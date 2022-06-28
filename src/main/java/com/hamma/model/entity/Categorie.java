package com.hamma.model.entity;

import java.io.Serializable;


import org.hibernate.annotations.Entity;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Categorie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2493222955471438881L;
	@Getter
	@Setter
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCategorie;
	
	@Getter
	@Setter
	@ColumnDefault(value="NOM_CATEGORIE")
	private String nomCategorie;
	
	@Getter
	@Setter
	@ColumnDefault(value="DESCRIPTION")
	private String description;

}
