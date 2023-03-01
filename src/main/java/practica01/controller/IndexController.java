 package practica01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import practica01.Service.EstadoService;

import practica01.domain.Estado;


@Slf4j
@Controller
public class IndexController {

    @Autowired
    EstadoService estadoService;

    //AGREGAR NUEVOS ESTADOS,NOS REDIRIGE A MODIFICAR
    @GetMapping("/agregarEstado")
    public String nuevoEstado(Estado estado) {  
        
        return "modificarEstado";
    }

    //LISTA DE ESTADOS 
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora desde MVC");

        var estados = estadoService.getEstados();
        model.addAttribute("estados", estados);  

        return "index";
    }

    //GUARDA DATOS EN LA BASE 
    @PostMapping("/guardarEstado")
    public String guardarEstado(Estado estado) {
         
        estadoService.save(estado);
        return "redirect:/";
    }

    @GetMapping("/modificarEstado/{idEstado}")
     public String modificarEstado(Estado estado, Model model){
         estado = estadoService.getEstado(estado);
         model.addAttribute("estado", estado);
         return "modificarEstado";
     }     



     
     
      @GetMapping("/eliminarEstado/{idEstado}")
    public String eliminarestado(Estado estado) {
                                                           //ELIMINAR Estado
        estadoService.delete(estado);
        return "redirect:/";

    }

}