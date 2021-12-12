package com.example.proyecto_ciclo_4.repositories;

import com.example.proyecto_ciclo_4.models.UsuariosModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuariosRepository extends MongoRepository<UsuariosModel ,String> {
    
}
