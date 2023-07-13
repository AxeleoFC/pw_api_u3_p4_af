package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFul {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	//GET
	@GetMapping(path = "/buscar")
	public Estudiante consultarPorCedula(String cedula) {
		return this.estudianteService.consultarPorCedula("1752310126");
	}
	
	@PostMapping(path = "/guardar")
	private void guardar(@RequestBody Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteService.guardar(estudiante);
	}
	
	@PutMapping(path = "/actualizar")
	private void actualizar() {
		// TODO Auto-generated method stub

	}
	
	@PatchMapping(path = "/actualizarParcial")
	private void actualizarParcial() {
		// TODO Auto-generated method stub

	}
	
	@DeleteMapping(path = "/borrar")
	private void borrar() {
		// TODO Auto-generated method stub

	}
}
