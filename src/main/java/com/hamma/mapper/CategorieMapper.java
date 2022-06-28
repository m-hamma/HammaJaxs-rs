package com.hamma.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hamma.dto.CategorieDto;
import com.hamma.entity.Categorie;

@Mapper
public interface CategorieMapper {
	@Mapping(source = "idCategorie", target = "idCategorie")
	@Mapping(source = "nomCategorie", target = "nomCategorie")
	@Mapping(source = "description", target = "description")
	CategorieDto entityToDto (Categorie entity);
	
	@Mapping(source = "idCategorie", target = "idCategorie")
	@Mapping(source = "nomCategorie", target = "nomCategorie")
	@Mapping(source = "description", target = "description")
	Categorie dtoToEntity (Categorie entity);

}
