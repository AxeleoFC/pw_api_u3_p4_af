package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Horario;
import com.example.demo.service.IHorarioService;

@RestController
@RequestMapping("/horarios")
public class HorarioControllerRestFul {
	
	@Autowired
	private IHorarioService horarioService;
	
	@GetMapping(path = "/{id}")
	public Horario consultarPorId(@PathVariable Integer id) {
		return this.horarioService.buscarHora(id);
	}
	
	@PostMapping
	private void guardar(@RequestBody Horario horario) {
		// TODO Auto-generated method stub
		this.horarioService.ingresar(horario);
	}
	
	@DeleteMapping(path = "/{id}")
	private void borrar(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		this.horarioService.eliminar(id);
	}
	
	@PutMapping(path = "/{id}")
	private void actualizar(@RequestBody Horario horario, @PathVariable Integer id) {
		// TODO Auto-generated method stub
		horario.setId(id);
		this.horarioService.cambiarHorario(horario);
		
	}
	
	@PatchMapping(path = "/{id}")
	private void actualizarParcial(@RequestBody Horario horario, @PathVariable Integer id) {
		// TODO Auto-generated method stub
		Horario horario2=this.horarioService.buscarHora(id);
		horario2.setFin(horario.getFin());
		this.horarioService.cambiarHorario(horario2);
	}

}
