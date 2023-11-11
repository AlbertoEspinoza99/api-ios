package com.moviles.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviles.entity.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
