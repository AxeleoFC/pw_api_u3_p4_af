package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.OrdenCobro;

@Repository
@Transactional
public class OrdenCobroRepositoryImpl implements IOrdenCobroRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<OrdenCobro> buscarPorNombreMateria(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<OrdenCobro> myQuery = this.entityManager.createQuery("SELECT o FROM OrdenCobro o WHERE o.materia.nombre= :datoNombre", OrdenCobro.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getResultList();
	}

	@Override
	public OrdenCobro buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(OrdenCobro.class, id);
	}

}
