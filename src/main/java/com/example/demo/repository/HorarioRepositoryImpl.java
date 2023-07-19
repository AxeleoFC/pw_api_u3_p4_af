package com.example.demo.repository;

import java.time.LocalTime;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Horario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HorarioRepositoryImpl implements IHorarioRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Horario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Horario.class, id);
	}

	@Override
	public void insertar(Horario horario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(horario);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(buscarPorId(id));
	}

	@Override
	public void actualizar(Horario horario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(horario);
	}

	@Override
	public void actualizarParcial(LocalTime fin, Integer id) {
		// TODO Auto-generated method stub
		TypedQuery<Horario> myQuery = this.entityManager
				.createQuery("UPDATE Horario h SET h.fin =:datoFin WHERE h.id =:datoId", Horario.class);
		myQuery.setParameter("datoFin", fin);
		myQuery.setParameter("datoId", id);
		myQuery.executeUpdate();
	}

}
