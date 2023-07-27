package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteTO;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;
	
	@Override
	public Estudiante consultarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorCedula(cedula);
	}

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepository.borrar(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.actualizar(estudiante);
	}

	@Override
	public void actualizarParcial(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.actualizarParcial(null, null);
	}

	@Override
	public List<Estudiante> buscarTodosEstudaintes() {
		// TODO Auto-generated method stub
		return this.estudianteRepository.todosEstudiantes();
	}

	@Override
	public Estudiante consultarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorId(id);
	}

	@Override
	public List<Estudiante> todosEstudiantesP(String provincia) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.todosEstudiantesP(provincia);
	}

	@Override
	public List<EstudianteTO> buscarTodos() {
		// TODO Auto-generated method stub
		List<Estudiante> estudiantes=this.estudianteRepository.todosEstudiantes();
		List<EstudianteTO> estudianteTOs = estudiantes.stream()
				.map(estudiante->this.transformarTO(estudiante))
				.collect(Collectors.toList());
		return estudianteTOs;
	}
	private EstudianteTO transformarTO(Estudiante estudiante) {
		EstudianteTO estudianteTO=new EstudianteTO();
		estudianteTO.setId(estudiante.getId());
		estudianteTO.setApellido(estudiante.getApellido());
		estudianteTO.setCedula(estudiante.getCedula());
		estudianteTO.setFechaNacimineto(estudiante.getFechaNacimineto());
		estudianteTO.setNombre(estudiante.getNombre());
		estudianteTO.setProvincia(estudiante.getProvincia());
		return estudianteTO;
		
	}
}
