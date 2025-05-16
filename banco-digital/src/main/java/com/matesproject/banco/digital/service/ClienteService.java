package com.matesproject.banco.digital.service;

import com.matesproject.banco.digital.model.Cliente;
import com.matesproject.banco.digital.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

@Service 
public class ClienteService {

    @Autowired // Injeta o repositório de clientes
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll(); // Usa o repositório para buscar todos os clientes
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id); // Usa o repositório para buscar um cliente pelo id
    }

    public Cliente salvar(Cliente cliente) {    // Aqui você pode adicionar validações antes de salvar
        
        Optional<Cliente> clienteCpf = clienteRepository.findByCpf(cliente.getCpf());

            if (clienteCpf.isPresent()) {
                throw new RuntimeException("CPF já cadastrado");
            }
        
        
        return clienteRepository.save(cliente); // Usa o repositório para salvar um cliente
    }

    public void deletar(Long id) {
        // Aqui você pode adicionar verificações antes de deletar
        clienteRepository.deleteById(id); // Usa o repositório para deletar um cliente
    }
}