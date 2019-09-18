package com.marson.cursojavamc.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marson.cursojavamc.domain.Cliente;
import com.marson.cursojavamc.repositories.ClienteRepository;
import com.marson.cursojavamc.services.exceptions.ObjectNotFountException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo ;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFountException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}
	
}
