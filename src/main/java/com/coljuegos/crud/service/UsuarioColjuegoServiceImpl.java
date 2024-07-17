package com.coljuegos.crud.service;

import com.coljuegos.crud.model.entity.UsuarioColjuegoEntity;
import com.coljuegos.crud.model.repository.UsuarioColjuegoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioColjuegoServiceImpl implements UsuarioColjuegoService{

    private final UsuarioColjuegoRepository repository;

    @Override
    public List<UsuarioColjuegoEntity> findAll() {
        return this.repository.findAll();
    }

    @Override
    public UsuarioColjuegoEntity findById(Long id) {
        return this.repository.findById(id).orElseThrow(()-> new EntityNotFoundException(id.toString()));
    }

    @Override
    public UsuarioColjuegoEntity create(UsuarioColjuegoEntity entity) {
        return this.repository.save(entity);
    }

    @Override
    public UsuarioColjuegoEntity update(Long id, UsuarioColjuegoEntity entity) {
        var found = this.findById(id);
        found.update(entity);
        return this.repository.save(found);
    }

    @Override
    public void delete(Long id) {
        this.findById(id);
        this.repository.deleteById(id);
    }
}
