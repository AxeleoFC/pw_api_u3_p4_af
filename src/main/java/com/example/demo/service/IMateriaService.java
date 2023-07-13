package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaService {

	public Materia bucarMateria(String nombre);
	public List<Materia> materias();
	public void agregar(Materia materia);
	public void eliminarPorNombre(String nombre);
	public void actualizar(Materia materia);
}
