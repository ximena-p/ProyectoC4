package com.example.proyecto_ciclo_4.controllers;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.example.proyecto_ciclo_4.models.TareasModel;
import com.example.proyecto_ciclo_4.services.TareasServices;
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
@RequestMapping("/tareas")
public class TareasController {
    
    @Autowired
    TareasServices tareasServices;

    @GetMapping()
    public ArrayList<TareasModel> obteberTareas(){
        return tareasServices.ObtenerTareas();
    }

    @PostMapping()
    public TareasModel GuardarTareas(@RequestBody TareasModel tareas){
        return tareasServices.GuardarTareas(tareas);
    }

    @DeleteMapping(path = "/{ID}")
    public String EliminarTareaPorID(@PathVariable("ID") String ID){
        if(this.tareasServices.EliminarTarea(ID))
            return "Se elimino la tarea con id " + ID;
        else
            return "No se pudo eliminar la tarea con id " + ID;
    }

    @GetMapping(path = "/puntos/{puntos}")
    public ArrayList<TareasModel> tareasporid(@PathVariable("id") long puntos){
        return tareasServices.ObtenerTareasid(puntos);
    }
}
