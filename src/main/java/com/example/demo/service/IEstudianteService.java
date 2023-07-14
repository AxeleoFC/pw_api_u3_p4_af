package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {
	
	public Estudiante consultarPorCedula(String cedula);
	
	public void guardar(Estudiante estudiante);
	
	public Estudiante consultarPorId(Integer id);
	
	public void eliminar(Integer id);
	
	public void actualizar(Estudiante estudiante);
	
	public void actualizarParcial(Estudiante estudiante);
	
	public List<Estudiante> buscarTodosEstudaintes();
	
	public List<Estudiante> todosEstudiantesP(String provincia);

}
