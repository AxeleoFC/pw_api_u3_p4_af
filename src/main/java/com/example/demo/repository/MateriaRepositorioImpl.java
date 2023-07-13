package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class MateriaRepositorioImpl implements IMateriaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Materia seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ingresar(Materia materia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Materia> todasMaterias() {
		// TODO Auto-generated method stub
		TypedQuery<Materia> myQuery = this.entityManager
				.createQuery("SELECT * FROM Materia m", Materia.class);
		return myQuery.getResultList();
	}

}
