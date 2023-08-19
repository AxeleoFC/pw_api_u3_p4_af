package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.to.MateriaTO;

public interface IMateriaService {

	public Materia buscar(Integer id);
	public List<Materia> materias();
	public void agregar(Materia materia);
	public void eliminar(Integer id);
	public void actualizar(Materia materia);
	
	public List<MateriaTO> buscarPorCedulaEstudiante(String cedula);

	public MateriaTO buscarPorId(Integer id);
}
