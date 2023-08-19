package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.OrdenCobro;

public interface IServiceOrdenCobro {
	
	public List<OrdenCobro> buscarPorNombreMateria(String nombre);

	public OrdenCobro buscarPorId(Integer id);

}
