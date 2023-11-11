package com.moviles.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_mesa")
public class Mesa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_mesa")
	private int cod;
	@Column(name = "numero_mesa")
	private int numero;
	@Column(name = "fecha_mesa")
	private LocalDate fecha;
	@Column(name = "dni_mesa")
	private String dni;
	@Column(name = "titular_mesa")
	private String titular;
	@Column(name = "piso_mesa")
	private int piso;
	@Column(name = "ninos_mesa")
	private int nrninos;
	@Column(name = "adulto_mesa")
	private int nradulto;
	@Column(name = "asiento_mesa")
	private int nrasiento;
	@Column(name = "costonino_mesa")
	private Double costonino;
	@Column(name = "costoaduto_mesa")
	private Double costoadulto;
	@Column(name = "total_mesa")
	private Double costototal;
	
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public int getNrninos() {
		return nrninos;
	}
	public void setNrninos(int nrninos) {
		this.nrninos = nrninos;
	}
	public int getNradulto() {
		return nradulto;
	}
	public void setNradulto(int nradulto) {
		this.nradulto = nradulto;
	}
	public int getNrasiento() {
		return nrasiento;
	}
	public void setNrasiento(int nrasiento) {
		this.nrasiento = nrasiento;
	}
	public Double getCostonino() {
		return costonino;
	}
	public void setCostonino(Double costonino) {
		this.costonino = costonino;
	}
	public Double getCostoadulto() {
		return costoadulto;
	}
	public void setCostoadulto(Double costoadulto) {
		this.costoadulto = costoadulto;
	}
	public Double getCostototal() {
		return costototal;
	}
	public void setCostototal(Double costototal) {
		this.costototal = costototal;
	}
	
	
	
	
}
