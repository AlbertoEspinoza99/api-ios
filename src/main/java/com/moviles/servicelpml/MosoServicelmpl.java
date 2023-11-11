package com.moviles.servicelpml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.moviles.dao.MosoRepository;
import com.moviles.entity.Moso;
@Service
public class MosoServicelmpl extends ICRUDlmpl<Moso, Integer>{

	@Autowired
	private MosoRepository repo;
	
	@Override
	public JpaRepository<Moso, Integer> getRepository() {
		// TODO Auto-generated method stub
		return repo;
	}

	public Moso inicioSesion(String username,String password) {
		
		
		return repo.iniciosesion(username, password);
	}
}
