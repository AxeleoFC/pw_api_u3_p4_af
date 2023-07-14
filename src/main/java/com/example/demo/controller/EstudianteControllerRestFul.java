package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFul {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	//GET
	@GetMapping(path = "/buscar/{cedula}")
	public Estudiante consultarPorCedula(@PathVariable String cedula) {
		return this.estudianteService.consultarPorCedula(cedula);
	}
	
	@PostMapping(path = "/guardar")
	private void guardar(@RequestBody Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteService.guardar(estudiante);
	}
	
	@PutMapping(path = "/actualizar/{id}")
	private void actualizar(@RequestBody Estudiante estudiante, @PathVariable Integer id) {
		// TODO Auto-generated method stub
		estudiante.setId(id);
		this.estudianteService.actualizar(estudiante);
		
	}
	
	@PatchMapping(path = "/actualizarParcial/{id}")
	private void actualizarParcial(@RequestBody Estudiante estudiante, @PathVariable Integer id) {
		// TODO Auto-generated method stub
		Estudiante estudiante2=this.estudianteService.consultarPorId(id);
		estudiante2.setId(id);
		estudiante2.setCedula(estudiante.getCedula());
		this.estudianteService.actualizar(estudiante2);
	}
	
	@DeleteMapping(path = "/borrar/{id}")
	private void borrar(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		this.estudianteService.eliminar(id);
	}
	
	@GetMapping(path = "/buscarTodos")
	public List<Estudiante> buscarTodos() {
		return this.estudianteService.buscarTodosEstudaintes();
	}
	
	@GetMapping(path = "/buscarTodosProvincia")
	public List<Estudiante> buscarTodosProvincia(@RequestParam String provincia) {
		return this.estudianteService.todosEstudiantesP(provincia);
	}
}
