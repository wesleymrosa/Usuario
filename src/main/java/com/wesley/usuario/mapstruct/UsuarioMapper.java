package com.wesley.usuario.mapstruct;

import com.wesley.usuario.dto.UsuarioRequestDTO;
import com.wesley.usuario.dto.UsuarioResponseDTO;
import com.wesley.usuario.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    @Mapping(target = "id", ignore = true)
    UsuarioEntity paraUsuarioEntity(UsuarioRequestDTO dto);

    UsuarioResponseDTO paraResponseDTO(UsuarioEntity entity);

    List<UsuarioResponseDTO> paraListaUsuarioResponseDTO(List<UsuarioEntity> lista);
}
