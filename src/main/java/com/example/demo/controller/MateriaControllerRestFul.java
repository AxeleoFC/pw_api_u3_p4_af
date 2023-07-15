package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.IMateriaService;

@RestController
@RequestMapping("/materias")
public class MateriaControllerRestFul {
	
	@Autowired
	private IMateriaService materiaService;
	
	@GetMapping(path = "/consultar")
	public List<Materia> listaMaterias() {
		return this.materiaService.materias();
	}
	
	@PostMapping(path = "/agregar")
	private void guardar(@RequestBody Materia materia) {
		// TODO Auto-generated method stub
		this.materiaService.agregar(materia);
	}
	

	@PutMapping(path = "/actualizar/{id}")
	private void actualizar(@RequestBody Materia materia, @PathVariable Integer id) {
		// TODO Auto-generated method stub
		materia.setId(id);
		this.materiaService.actualizar(materia);
		
	}
	
	@DeleteMapping(path = "/borrar/{id}")
	private void borrar(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		this.materiaService.eliminar(id);
	}

	@GetMapping(path = "/buscar/{id}")
	public Materia consultarPorCedula(@PathVariable Integer id) {
		return this.materiaService.buscar(id);
	}
}
