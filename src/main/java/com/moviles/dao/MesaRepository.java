package com.moviles.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.moviles.entity.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Integer>{

	
	@Query(value="select * from tb_mesa where dni_mesa=?1",nativeQuery = true)
	public List<Mesa> listaMesaDni(int numero);
}
