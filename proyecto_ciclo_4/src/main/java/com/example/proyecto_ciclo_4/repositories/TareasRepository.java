package com.example.proyecto_ciclo_4.repositories;

import java.util.ArrayList;

import com.example.proyecto_ciclo_4.models.TareasModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface TareasRepository  extends MongoRepository<TareasModel, String> {
    
    @Query("{'id' : {$gte: ?0} }")
    ArrayList <TareasModel> idtareas(long puntos);
}
