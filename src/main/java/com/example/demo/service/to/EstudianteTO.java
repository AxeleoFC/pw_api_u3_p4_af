package com.example.demo.service.to;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.hateoas.RepresentationModel;

public class EstudianteTO extends RepresentationModel<EstudianteTO> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String cedula;
	private String nombre;
	private String apellido;
	private String provincia;
	private LocalDateTime fechaNacimineto;

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimineto=" + fechaNacimineto + "]";
	}

	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimineto() {
		return fechaNacimineto;
	}

	public void setFechaNacimineto(LocalDateTime fechaNacimineto) {
		this.fechaNacimineto = fechaNacimineto;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
