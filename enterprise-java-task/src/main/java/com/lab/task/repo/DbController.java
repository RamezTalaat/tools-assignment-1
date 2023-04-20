package com.lab.task.repo;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.lab.task.model.Equation;

@Stateless
public class DbController {
	@PersistenceContext
	private EntityManager entityManager;
	public DbController() {
		// TODO Auto-generated constructor stub
	}

	public void addEquation(Equation equation) {
		entityManager.persist(equation);
	}
	
	public List<Equation> getEquations() {
        return entityManager.createQuery("select e from Equation e", Equation.class).getResultList();
    }
}
