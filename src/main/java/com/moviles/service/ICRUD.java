package com.moviles.service;

import java.util.List;

public interface ICRUD<T,ID>{

	T save(T obj);
	T update(T obj);
	void delete(ID cod);
	T findById(ID cod);
	List<T> findall();
	
}
