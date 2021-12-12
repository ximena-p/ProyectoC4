package com.example.proyecto_ciclo_4.services;

import java.util.ArrayList;
import com.example.proyecto_ciclo_4.models.UsuariosModel;
import com.example.proyecto_ciclo_4.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServices {
    @Autowired
    UsuariosRepository usuariosRepository;

    public ArrayList<UsuariosModel> ObtenerUsuarios(){
        return (ArrayList<UsuariosModel>) usuariosRepository.findAll();
    }

    public UsuariosModel GuardarUsuario(UsuariosModel usuario){
        return usuariosRepository.save(usuario);
    }

    public boolean EliminarUsuario(String ID){
        if(usuariosRepository.existsById(ID)){
            usuariosRepository.deleteById(ID);
            return true;
        }else{
            return false;
        }
    }
}
