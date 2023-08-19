package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {
	public Materia seleccionarPorNombre(String nombre);
	public Materia seleccionarPorId(Integer id);
	public List<Materia> todasMaterias();
	public void ingresar(Materia materia);
	public void eliminarPorId(Integer id);
	public void actualizar(Materia materia);
	
	public List<Materia> buscarPorCedulaEstudiante(String cedula);

	public Materia buscarPorId(Integer id);

}
