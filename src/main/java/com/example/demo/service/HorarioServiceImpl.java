package com.example.demo.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHorarioRepository;
import com.example.demo.repository.modelo.Horario;

@Service
public class HorarioServiceImpl implements IHorarioService {
	
	@Autowired
	private IHorarioRepository horarioRepository;

	@Override
	public Horario buscarHora(Integer id) {
		// TODO Auto-generated method stub
		return this.horarioRepository.buscarPorId(id);
	}

	@Override
	public void ingresar(Horario horario) {
		// TODO Auto-generated method stub
		this.horarioRepository.insertar(horario);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.horarioRepository.borrar(id);
	}

	@Override
	public void cambiarHorario(Horario horario) {
		// TODO Auto-generated method stub
		this.horarioRepository.actualizar(horario);
	}

	@Override
	public void cambiarFinHorario(LocalTime fin, Integer id) {
		// TODO Auto-generated method stub
		this.horarioRepository.actualizarParcial(fin, id);
	}

}
