/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package practica01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import practica01.Service.EstadoService;

import practica01.domain.Estado;


/**
 *
 * @author esteb
 */
@Slf4j
@Controller
public class IndexController {
    
    @Autowired        
    EstadoService estadoService;
    
    
    @GetMapping("/agregarEstado")
    public String nuevoCliente(Estado estado) {
        log.info("holaaa");
        return "modificadarEstado";
    }
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora desde MVC");

        var estados = estadoService.getEstados();
        model.addAttribute("estados", estados);  //Traer lista de clientes

        return "index";
    }
}
