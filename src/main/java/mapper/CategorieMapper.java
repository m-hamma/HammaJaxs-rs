package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hamma.entity.Categorie;

import dto.CategorieDto;

@Mapper
public interface CategorieMapper {
	@Mapping(source = "idCategorie", target = "idCategoriel")
	@Mapping(source = "nomCategorie", target = "nomCategoriel")
	@Mapping(source = "description", target = "description")
	CategorieDto entityToDto (Categorie entity);
	
	@Mapping(source = "idCategorie", target = "idCategoriel")
	@Mapping(source = "nomCategorie", target = "nomCategoriel")
	@Mapping(source = "description", target = "description")
	Categorie dtoToEntity (Categorie entity);

}
