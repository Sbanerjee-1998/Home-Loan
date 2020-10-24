package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Applicant;
import com.lti.model.HomeLoan;

public class LoanDao {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	public LoanDao() {
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx = em.getTransaction();
	}
	
	public void addALoan(HomeLoan loan) {
		tx.begin();
		em.merge(loan);
		tx.commit();
		System.out.println("Loan Accepted");
	}
	public void addAnApplicant(Applicant applicant) {
		tx.begin();
		em.persist(applicant);
		tx.commit();
		System.out.println("Applicant Added");
	}
	public Applicant findAnApplicant(int app_id){
        return em.find(Applicant.class, app_id);
	}
}
