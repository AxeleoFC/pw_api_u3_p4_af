package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {
	public Estudiante seleccionarPorCedula(String cedula);
	public void insertar(Estudiante estudiante);
	public void eliminarPorCedula(String cedula);
	public void actualizar(Estudiante estudiante);
	public void actualizarParcial(Estudiante estudiante);

}
