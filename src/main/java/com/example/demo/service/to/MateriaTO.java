package com.example.demo.service.to;

public class MateriaTO {
	
	private Integer id;
	
	private String nombre;
	
	private Integer horas;
	
	private Integer creditos;
	
	private String profesor;

	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", creditos=" + creditos
				+ ", profesor=" + profesor + "]";
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


}
