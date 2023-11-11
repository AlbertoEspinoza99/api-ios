package com.moviles.servicelpml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.moviles.dao.MesaRepository;
import com.moviles.entity.Mesa;
@Service
public class MesaServicelmpl extends ICRUDlmpl<Mesa, Integer>{

	@Autowired
	private MesaRepository repo;
	
	@Override
	public JpaRepository<Mesa, Integer> getRepository() {
		// TODO Auto-generated method stub
		return repo;
	}

	
	public List<Mesa> listaPorDNI(int numero){
		return repo.listaMesaDni(numero);
	}
	
}
