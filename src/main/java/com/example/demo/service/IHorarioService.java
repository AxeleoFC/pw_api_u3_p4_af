package com.example.demo.service;

import java.time.LocalTime;

import com.example.demo.repository.modelo.Horario;

public interface IHorarioService {
	
	public Horario buscarHora(Integer id);
	public void ingresar(Horario horario);
	public void eliminar(Integer id);
	public void cambiarHorario(Horario horario);
	public void cambiarFinHorario(LocalTime fin, Integer id);

}
