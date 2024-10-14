package com.wesley.usuario.repository;

import com.wesley.usuario.entities.UsuarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    UsuarioEntity findByEmail (String email);

    @Transactional
    void deleteAllByEmail (String email);
}
