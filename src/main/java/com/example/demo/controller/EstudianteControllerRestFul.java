package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFul {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	// GET

	@GetMapping(path = "/{cedula}", produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Estudiante consultarPorCedula(@PathVariable String cedula) {

	return this.estudianteService.consultarPorCedula(cedula);

	}
	
	@GetMapping(path = "/status/{cedula}")
	public ResponseEntity<Estudiante> consultarPorCedulaStatus(@PathVariable String cedula) {
		return ResponseEntity.status(HttpStatus.OK).body(this.estudianteService.consultarPorCedula(cedula));
	}
	
	// POST

	@PostMapping(consumes = "application/xml")
	public void insertar(@RequestBody Estudiante estudiante) {
		this.estudianteService.guardar(estudiante);
	}
	
	@PostMapping(consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
	public Estudiante insertarBuscar(@RequestBody Estudiante estudiante) {
		this.estudianteService.guardar(estudiante);
		return this.estudianteService.consultarPorCedula(estudiante.getCedula());
	}
	
	@PutMapping(path = "/{id}")
	private void actualizar(@RequestBody Estudiante estudiante, @PathVariable Integer id) {
		// TODO Auto-generated method stub
		estudiante.setId(id);
		this.estudianteService.actualizar(estudiante);
		
	}
	
	@PatchMapping(path = "/{id}")
	private void actualizarParcial(@RequestBody Estudiante estudiante, @PathVariable Integer id) {
		// TODO Auto-generated method stub
		Estudiante estudiante2=this.estudianteService.consultarPorId(id);
		estudiante2.setCedula(estudiante.getCedula());
		this.estudianteService.actualizar(estudiante2);
	}
	
	@DeleteMapping(path = "/{id}")
	private void borrar(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		this.estudianteService.eliminar(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Estudiante>> buscarTodos() {
		List<Estudiante> estu=this.estudianteService.buscarTodosEstudaintes();
		System.out.println(estu);
		HttpHeaders cabeceras=new HttpHeaders();
		//.add(clve,valor)
		cabeceras.add("detalle mensaje", "ciudadano consultados exitosamente");
		return new ResponseEntity<>(estu,cabeceras,2020);
	}
	
	@GetMapping(path = "/buscarTodosProvincia")
	public List<Estudiante> buscarTodosProvincia(@RequestParam String provincia) {
		return this.estudianteService.todosEstudiantesP(provincia);
	}
}
