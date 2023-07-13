package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {
	public Materia seleccionarPorNombre(String nombre);
	public List<Materia> todasMaterias();
	public void ingresar(Materia materia);
	public void eliminarPorNombre(String nombre);
	public void actualizar(Materia materia);

}
