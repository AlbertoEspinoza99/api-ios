package com.moviles.servicelpml;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviles.service.ICRUD;

public abstract class ICRUDlmpl<T,ID> implements ICRUD<T, ID>{

	
	public abstract JpaRepository<T, ID> getRepository();
	
	@Override
	public T save(T obj) {
		// TODO Auto-generated method stub
		return getRepository().save(obj);
	}

	@Override
	public T update(T obj) {
		// TODO Auto-generated method stub
		return getRepository().save(obj);
	}

	@Override
	public void delete(ID cod) {
	
		getRepository().deleteById(cod);
		
	}

	@Override
	public T findById(ID cod) {
		
		return getRepository().findById(cod).orElse(null);
	}

	@Override
	public List<T> findall() {
		// TODO Auto-generated method stub
		return getRepository().findAll();
	}

}
