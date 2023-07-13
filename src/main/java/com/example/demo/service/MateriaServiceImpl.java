package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepository materiaRepository;
	
	@Override
	public Materia bucarMateria(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Materia> materias() {
		// TODO Auto-generated method stub
		return this.materiaRepository.todasMaterias();
	}

	@Override
	public void agregar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.ingresar(materia);
	}

	@Override
	public void eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub

	}

}
