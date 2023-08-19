package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {
	public Estudiante seleccionarPorCedula(String cedula);
	public Estudiante buscarPorId(Integer id);
	public void insertar(Estudiante estudiante);
	public void borrar(Integer id);
	public void actualizar(Estudiante estudiante);
	public void actualizarParcial(String cedula, String cedulaBuscar);
	public List<Estudiante> todosEstudiantes();
	public List<Estudiante> todosEstudiantesP(String provincia);

}
