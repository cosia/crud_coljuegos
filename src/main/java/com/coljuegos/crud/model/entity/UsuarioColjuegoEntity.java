package com.coljuegos.crud.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "USUARIO_COLJUEGOS")
@Getter
@Setter
public class UsuarioColjuegoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "fecha_registro", updatable = false, nullable = false)
    private LocalDateTime fechaRegistro = LocalDateTime.now();


    public void update(UsuarioColjuegoEntity entity){
        this.nombre = entity.getNombre();
        this.password = entity.getPassword();
        this.correo = entity.getCorreo();
    }
}
