package com.example.proyecto_ciclo_4.controllers;

import java.util.ArrayList;

import com.example.proyecto_ciclo_4.models.UsuariosModel;
import com.example.proyecto_ciclo_4.services.UsuariosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/usuario")
public class usuarioController {

    @Autowired
    UsuariosServices usuariosServices;

    @GetMapping()
    public ArrayList<UsuariosModel> ObtenerUsuarios(){
        return usuariosServices.ObtenerUsuarios();
    }

    @PostMapping()
    public UsuariosModel GuardarUsuario(@RequestBody UsuariosModel usuario){
        return usuariosServices.GuardarUsuario(usuario);
    }

    @DeleteMapping(path = "/{ID}")
    public String EliminarClientePorId(@PathVariable("ID") String ID){
        if(this.usuariosServices.EliminarUsuario(ID))
            return "Se elimino el usuario con id" + ID;
        else
            return "No se elimino el usuario con id" + ID;
    }
}
