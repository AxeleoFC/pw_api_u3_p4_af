package com.example.demo.repository.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mate_id_seq")
	@SequenceGenerator(name = "mate_id_seq", sequenceName = "mate_id_seq", allocationSize = 1)
	@Column(name = "mate_id")
	private Integer id;
	
	@Column(name = "mate_nombre")
	private String nombre;
	
	@Column(name = "mate_horas")
	private Integer horas;
	
	@Column(name = "mate_creditos")
	private Integer creditos;
	
	@Column(name = "mate_profesor")
	private String profesor;
	
	@JoinColumn(name = "mate_id_estudiante")
	@ManyToOne(cascade = CascadeType.MERGE)
	private Estudiante estudiante;

	
	@OneToMany(mappedBy = "materia")
	private List<OrdenCobro> cobros;
	
	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", creditos=" + creditos
				+ ", profesor=" + profesor + ", estudiante=" + estudiante;
	}
	
	
	//GET y SET
	public Integer getId() {
		return id;
	}

	

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}
