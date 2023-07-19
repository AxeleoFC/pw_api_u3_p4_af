package com.example.demo.repository.modelo;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "horario")
public class Horario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hora_id_seq")
	@SequenceGenerator(name = "hora_id_seq", sequenceName = "hora_id_seq", allocationSize = 1)
	@Column(name = "hora_id")
	private Integer id;
	
	@Column(name = "hora_inicio")
	private LocalTime inicio;
	
	@Column(name = "hora_fin")
	private LocalTime fin;

	@Override
	public String toString() {
		return "Horario [inicio=" + inicio + ", fin=" + fin + "]";
	}

	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalTime inicio) {
		this.inicio = inicio;
	}

	public LocalTime getFin() {
		return fin;
	}

	public void setFin(LocalTime fin) {
		this.fin = fin;
	}
}
