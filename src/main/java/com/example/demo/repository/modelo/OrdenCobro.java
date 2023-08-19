package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cobro")
public class OrdenCobro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cobro_id_seq")
	@SequenceGenerator(name = "cobro_id_seq", sequenceName = "cobro_id_seq", allocationSize = 1)
	@Column(name = "cobro_id")
	private Integer id;

	@Column(name = "cobro_pago")
	private BigDecimal pago;
	
	@JoinColumn(name = "cobro_id_materia")
	@ManyToOne(cascade = CascadeType.ALL)
	private Materia materia;

	@Override
	public String toString() {
		return "OrdenCobro [id=" + id + ", pago=" + pago + "]";
	}

	//GET y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPago() {
		return pago;
	}

	public void setPago(BigDecimal pago) {
		this.pago = pago;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
}
