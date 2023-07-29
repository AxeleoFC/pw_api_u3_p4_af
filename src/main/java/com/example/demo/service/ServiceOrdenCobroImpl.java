package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.OrdenCobro;
import com.example.demo.service.to.MateriaTO;

public class ServiceOrdenCobroImpl implements IServiceOrdenCobro {

	@Override
	public List<OrdenCobro> buscarPorNombreMateria(String nombre) {
		// TODO Auto-generated method stub
		/*List<Materia> lista = this.materiaRepository.buscarPorCedulaEstudiante(cedula);
		List<MateriaTO> listaFinal= lista.stream().map(materia -> this.convertir(materia)).collect(Collectors.toList());
		return listaFinal;*/
		return null;
	}

	@Override
	public OrdenCobro buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
