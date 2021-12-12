package com.example.proyecto_ciclo_4.services;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.example.proyecto_ciclo_4.models.TareasModel;
import com.example.proyecto_ciclo_4.repositories.TareasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareasServices {
    @Autowired
    TareasRepository tareasRepository;

    public ArrayList<TareasModel> ObtenerTareas(){
        return (ArrayList<TareasModel>) tareasRepository.findAll();
    } 

    public TareasModel GuardarTareas(TareasModel tareas){
        return tareasRepository.save(tareas);
    }

    public boolean EliminarTarea(String ID){
        if(tareasRepository.existsById(ID)){
            tareasRepository.deleteById(ID);
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<TareasModel> ObtenerTareasid(long puntos){
        return tareasRepository.idtareas(puntos);
    } 
}
