package com.coljuegos.crud.model.repository;

import com.coljuegos.crud.model.entity.UsuarioColjuegoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioColjuegoRepository extends JpaRepository<UsuarioColjuegoEntity, Long> {
}
