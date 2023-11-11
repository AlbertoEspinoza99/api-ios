package com.moviles.servicelpml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.moviles.dao.ClienteRepository;
import com.moviles.entity.Cliente;

@Service
public class ClienteServicelmpl extends ICRUDlmpl<Cliente, Integer>{

	@Autowired
	private ClienteRepository repo;
	
	@Override
	public JpaRepository<Cliente, Integer> getRepository() {
		// TODO Auto-generated method stub
		return repo;
	}

}
