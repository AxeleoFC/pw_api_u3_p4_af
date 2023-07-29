package com.example.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@JsonIgnoreProperties(value = {"materias"})
@Table(name = "estudiante")
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_id_seq")
	@SequenceGenerator(name = "estu_id_seq", sequenceName = "estu_id_seq", allocationSize = 1)
	@Column(name = "estu_id")
	private Integer id;

	@Column(name = "estu_cedula")
	private String cedula;

	@Column(name = "estu_nombre")
	private String nombre;

	@Column(name = "estu_apellido")
	private String apellido;
	
	@Column(name = "estu_provincia")
	private String provincia;
	
	@Column(name = "estu_fecha_nacimineto")
	private LocalDateTime fechaNacimineto;

	@OneToMany(mappedBy = "estudiante")
	private List<Materia> materias;
	

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", provincia=" + provincia + ", fechaNacimineto=" + fechaNacimineto + ", materias=" + materias + "]";
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
	
	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}


}
