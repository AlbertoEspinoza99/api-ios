package com.moviles.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.moviles.entity.Moso;
@Repository
public interface MosoRepository extends JpaRepository<Moso, Integer>{

	
	
	@Query(value="select * from tb_moso where usuario_moso=?1 and contrasena_moso=?2",nativeQuery = true)
	public Moso iniciosesion(String usuario,String password);
	
}
