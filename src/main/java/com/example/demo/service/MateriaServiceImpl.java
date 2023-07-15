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
	public Materia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.materiaRepository.seleccionarPorId(id);
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
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.actualizar(materia);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.materiaRepository.eliminarPorId(id);
	}

}
