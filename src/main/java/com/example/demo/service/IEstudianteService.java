package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {
	
	public Estudiante consultarPorCedula(String cedula);
	public void guardar(Estudiante estudiante);
	public void eliminarPorCedula(String cedula);
	public void actualizar(Estudiante estudiante);
	public void actualizarParcial(Estudiante estudiante);

}
