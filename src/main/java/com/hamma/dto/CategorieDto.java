package com.hamma.dto;

import java.io.Serializable;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

public class CategorieDto implements Serializable {
	private static final long serialVersionUID = 1493222955471438881L;
	@Getter
	@Setter
	private long idCategorie;
	
	@Getter
	@Setter
	private String nomCategorie;
	
	@Getter
	@Setter
	private String description;
}
