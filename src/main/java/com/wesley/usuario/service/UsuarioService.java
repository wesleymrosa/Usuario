package com.wesley.usuario.service;

import com.wesley.usuario.dto.UsuarioRequestDTO;
import com.wesley.usuario.dto.UsuarioResponseDTO;
import com.wesley.usuario.mapstruct.UsuarioMapper;
import com.wesley.usuario.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;

    public UsuarioResponseDTO salvarUsuario(UsuarioRequestDTO request) {
        return mapper.paraResponseDTO(
                repository.save(
                        mapper.paraUsuarioEntity(request)));
    }

    public List<UsuarioResponseDTO> buscaTodosUsuarios() {
        return mapper.paraListaUsuarioResponseDTO(
                repository.findAll());
    }

    public UsuarioResponseDTO buscaUsuarioPorEmail(String email) {
        return mapper.paraResponseDTO(
                repository.findByEmail(email));
    }

    public void deletaUsuarioPorEmail(String email) {
        repository.deleteAllByEmail(email);
    }
}
