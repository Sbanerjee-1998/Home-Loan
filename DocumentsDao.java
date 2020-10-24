package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Applicant;
import com.lti.model.DocumentsUpload;

public class DocumentsDao {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	public DocumentsDao() {
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx = em.getTransaction();
	}
	public void addAnApplicant(Applicant applicant) {
		tx.begin();
		em.persist(applicant);
		tx.commit();
		System.out.println("Applicant Added");
	}
	public void addDocuments(DocumentsUpload document) {
		tx.begin();
		em.merge(document);
		tx.commit();
		System.out.println("Documents Added");
	}
	public Applicant findAnApplicant(int app_id){
        return em.find(Applicant.class, app_id);
	}
}
