package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.to.MateriaTO;

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
	
	@Override
	public List<MateriaTO> buscarPorCedulaEstudiante(String cedula) {
		// TODO Auto-generated method stub
		List<Materia> lista = this.materiaRepository.buscarPorCedulaEstudiante(cedula);
		List<MateriaTO> listaFinal= lista.stream().map(materia -> this.convertir(materia)).collect(Collectors.toList());
		return listaFinal;
	}

	private MateriaTO convertir(Materia materia) {
		MateriaTO mat = new MateriaTO();
		mat.setId(materia.getId());
		mat.setNombre(materia.getNombre());
		mat.setCreditos(materia.getCreditos());

		return mat;
	}

	@Override
	public MateriaTO buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		MateriaTO materia = this.convertir(this.materiaRepository.buscarPorId(id));
		return materia;
	}

}
