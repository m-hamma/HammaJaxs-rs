package com.hamma.dto;

import java.io.Serializable;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Data
public class CategorieDto implements Serializable {
	private static final long serialVersionUID = 1493222955471438881L;

	private long idCategorie;
	private String nomCategorie;
	private String description;
}
