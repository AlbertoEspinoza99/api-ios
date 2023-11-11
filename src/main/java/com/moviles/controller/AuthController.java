package com.moviles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.entity.Moso;
import com.moviles.entity.Sesion;
import com.moviles.servicelpml.MosoServicelmpl;

@RestController
@RequestMapping("/auth")
public class AuthController {

	
	@Autowired
	private MosoServicelmpl sermos;
	
	
	@PostMapping("/iniciosesion")
	public ResponseEntity<Moso> inicio(@RequestBody Sesion obj){
		
		
		Moso  ww=sermos.inicioSesion(obj.getUsername(), obj.getPassword());
		
		return new ResponseEntity<>(ww,HttpStatus.OK);
	}
	
	
}
