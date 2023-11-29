package com.firstapp.firstspringapp.controller;

import com.firstapp.firstspringapp.dto.PersonaDto;
import com.firstapp.firstspringapp.dto.response.GreetingsResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/")
    public String saludar(){
        return "Hola Mundo!";
    }

    @GetMapping("/{nombre}")
    public String saludarPorNombre(@PathVariable String nombre){
        return "Hola " + nombre;
    }

    @GetMapping("/{nombre}/{apellido}")
    public String saludarPorNombre(@PathVariable String nombre, @PathVariable String apellido){
        return "Hola " + nombre + " " + apellido;
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam String name, @RequestParam String lastname){
        return "Hola " + name + " " + lastname;
    }

    @PostMapping("/registrar")
    public PersonaDto guardarSaludo(@RequestBody PersonaDto persona){
        System.out.println(persona);
        return persona;
    }

    @GetMapping("/registro")
    public ResponseEntity<?> saludo(@RequestParam String name){
        GreetingsResponseDto saludo = new GreetingsResponseDto(name);
        return new ResponseEntity<>(saludo, HttpStatus.OK);
    }

    @PostMapping("/registro")
    public ResponseEntity<?> crearPersona(@RequestBody PersonaDto persona){
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

}