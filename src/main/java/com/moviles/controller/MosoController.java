package com.moviles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.entity.Cliente;
import com.moviles.entity.Moso;
import com.moviles.servicelpml.MosoServicelmpl;

@RestController
@RequestMapping("/moso")
public class MosoController {

	@Autowired
	private MosoServicelmpl sermos;
	
	
	
	
	
	@GetMapping("/lista")
	public ResponseEntity<List<Moso>> lista() throws NotFoundException{
		
		List<Moso> lista=sermos.findall();
		
        
			
			return new ResponseEntity<>(lista,HttpStatus.OK);
		
		
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Moso> guardar(@RequestBody Moso obj){
		
		Moso oo=sermos.save(obj);
		
		return new ResponseEntity<>(oo,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/obtener/{cod}")
	public ResponseEntity<Moso> obtener(@PathVariable("cod")int cod) throws NotFoundException{
		
		Moso objetivo=sermos.findById(cod);
		if(objetivo==null) {
			
			throw new NotFoundException();
		}
		else {
			
			return new ResponseEntity<>(objetivo,HttpStatus.OK);
		}
		
	}
	
	
	@PutMapping("/actualizar")
	public ResponseEntity<Moso> actualizar(@RequestBody Moso obj) throws NotFoundException{
		
		Moso objetivo=sermos.findById(obj.getCod());
		
	if(objetivo==null) {
		
		throw new NotFoundException();
	}
	else {
		Moso oo=sermos.save(obj);
		return new ResponseEntity<>(oo,HttpStatus.OK);
	}
	

	}
	
	
	@DeleteMapping("/eliminar/{cod}")
	public ResponseEntity<Void> eliminar(@PathVariable("cod")int cod) throws NotFoundException{
		
		
		Moso objetivo=sermos.findById(cod);
		
       if(objetivo==null) {
			
			throw new NotFoundException();
		}
		else {
			
			sermos.delete(cod);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		
	}
	
	
	
}
