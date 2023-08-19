package com.example.demo.repository;

import java.time.LocalTime;

import com.example.demo.repository.modelo.Horario;

public interface IHorarioRepository {
	
	public Horario buscarPorId(Integer id);
	public void insertar(Horario horario);
	public void borrar(Integer id);
	public void actualizar(Horario horario);
	public void actualizarParcial(LocalTime fin, Integer id);

}
