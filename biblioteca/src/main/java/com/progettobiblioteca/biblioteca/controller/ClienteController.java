package com.progettobiblioteca.biblioteca.controller;

import com.progettobiblioteca.biblioteca.entities.ClienteEntity;
import com.progettobiblioteca.biblioteca.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblioteca/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/get-all")
    public List<ClienteEntity> getAllLibri(){
        return clienteService.getAllCliente();
    }

    @GetMapping("/get-by-id/{id}")
    public ClienteEntity getClienteById(@PathVariable Long id){
        return clienteService.getClienteById(id).get();
    }

    @PostMapping("/save")
    public ClienteEntity saveCliente(@RequestBody ClienteEntity cliente){
        return clienteService.saveCliente(cliente);
    }

    @PutMapping("/update")
    public ClienteEntity updateCliente(@RequestBody ClienteEntity cliente){
        return clienteService.updateCliente(cliente);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCliente(@PathVariable Long id){
        clienteService.deleteCliente(id);
    }
}
