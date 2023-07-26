package com.progettobiblioteca.biblioteca.service;

import com.progettobiblioteca.biblioteca.entities.ClienteEntity;
import com.progettobiblioteca.biblioteca.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteEntity> getAllCliente() {
        return clienteRepository.findAll();
    }

    //custom
    /*public List<AutoreEntity> getAllAutoreCustom(){
        return autoreRepository.getAllAutore();
    }*/

    public Optional<ClienteEntity> getClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public ClienteEntity updateCliente(ClienteEntity clienteNew) {
        if (clienteNew == null) throw new NullPointerException("Compilare tutti i campi");

        Optional<ClienteEntity> clienteEntity = getClienteById(clienteNew.getId());

        if (clienteEntity.isEmpty()) throw new NullPointerException();
        return clienteRepository.save(clienteNew);
    }

    public ClienteEntity saveCliente(ClienteEntity entity) {
        return clienteRepository.save(entity);
    }
}