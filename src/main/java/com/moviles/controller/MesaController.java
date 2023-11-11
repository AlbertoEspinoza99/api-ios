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

import com.moviles.entity.Mesa;
import com.moviles.entity.Moso;
import com.moviles.servicelpml.MesaServicelmpl;

@RestController
@RequestMapping("/mesa")
public class MesaController {

	@Autowired
	private MesaServicelmpl sermes;
	
	
	@GetMapping("/listaporDNI/{dni}")
	public ResponseEntity<List<Mesa>> listapordni(@PathVariable("dni")int dni) throws NotFoundException{
		
		List<Mesa> lista=sermes.listaPorDNI(dni);
		
          if(lista==null) {
			
			throw new NotFoundException();
	  	}
		 else {
			
			
			return new ResponseEntity<>(lista,HttpStatus.OK);
		 }
		
	}
	
	
	
	
	@GetMapping("/lista")
	public ResponseEntity<List<Mesa>> lista() throws NotFoundException{
		
		List<Mesa> lista=sermes.findall();
		
        
			
			return new ResponseEntity<>(lista,HttpStatus.OK);
		
		
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Mesa> guardar(@RequestBody Mesa obj){
		
		Mesa oo=sermes.save(obj);
		
		return new ResponseEntity<>(oo,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/obtener/{cod}")
	public ResponseEntity<Mesa> obtener(@PathVariable("cod")int cod) throws NotFoundException{
		
		Mesa objetivo=sermes.findById(cod);
		if(objetivo==null) {
			
			throw new NotFoundException();
		}
		else {
			
			return new ResponseEntity<>(objetivo,HttpStatus.OK);
		}
		
	}
	
	
	@PutMapping("/actualizar")
	public ResponseEntity<Mesa> actualizar(@RequestBody Mesa obj) throws NotFoundException{
		
		Mesa objetivo=sermes.findById(obj.getCod());
		
	if(objetivo==null) {
		
		throw new NotFoundException();
	}
	else {
		Mesa oo=sermes.save(obj);
		return new ResponseEntity<>(oo,HttpStatus.OK);
	}
	

	}
	
	
	@DeleteMapping("/eliminar/{cod}")
	public ResponseEntity<Void> eliminar(@PathVariable("cod")int cod) throws NotFoundException{
		
		
		Mesa objetivo=sermes.findById(cod);
		
       if(objetivo==null) {
			
			throw new NotFoundException();
		}
		else {
			
			sermes.delete(cod);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		
	}
	
	
	
	 
	
	
	
	
}
