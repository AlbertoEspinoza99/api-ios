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
import com.moviles.servicelpml.ClienteServicelmpl;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteServicelmpl serClie;
	
	
	@GetMapping("/lista")
	public ResponseEntity<List<Cliente>> lista() throws NotFoundException{
		
		List<Cliente> lista=serClie.findall();
		
        
			
			return new ResponseEntity<>(lista,HttpStatus.OK);
		
		
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Cliente> guardar(@RequestBody Cliente obj){
		
	Cliente oo=serClie.save(obj);
		
		return new ResponseEntity<>(oo,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/obtener/{cod}")
	public ResponseEntity<Cliente> obtener(@PathVariable("cod")int cod) throws NotFoundException{
		
		Cliente objetivo=serClie.findById(cod);
		if(objetivo==null) {
			
			throw new NotFoundException();
		}
		else {
			
			return new ResponseEntity<>(objetivo,HttpStatus.OK);
		}
		
	}
	
	
	@PutMapping("/actualizar")
	public ResponseEntity<Cliente> actualizar(@RequestBody Cliente obj) throws NotFoundException{
		
	Cliente objetivo=serClie.findById(obj.getCod());
		
	if(objetivo==null) {
		
		throw new NotFoundException();
	}
	else {
		Cliente oo=serClie.save(obj);
		return new ResponseEntity<>(oo,HttpStatus.OK);
	}
	

	}
	
	
	@DeleteMapping("/eliminar/{cod}")
	public ResponseEntity<Void> eliminar(@PathVariable("cod")int cod) throws NotFoundException{
		
		
		Cliente objetivo=serClie.findById(cod);
		
       if(objetivo==null) {
			
			throw new NotFoundException();
		}
		else {
			
			serClie.delete(cod);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		
	}
	
	
	
	
}
