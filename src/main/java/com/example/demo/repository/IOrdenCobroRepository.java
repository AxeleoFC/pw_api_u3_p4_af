package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.OrdenCobro;

public interface IOrdenCobroRepository {
	
	public List<OrdenCobro> buscarPorNombreMateria(String nombre);

	public OrdenCobro buscarPorId(Integer id);

}
