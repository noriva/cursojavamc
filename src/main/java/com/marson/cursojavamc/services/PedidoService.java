package com.marson.cursojavamc.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marson.cursojavamc.domain.Pedido;
import com.marson.cursojavamc.repositories.PedidoRepository;
import com.marson.cursojavamc.services.exceptions.ObjectNotFountException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo ;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFountException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}
	
}
