package test;

import java.util.List;

import javax.persistence.*;

import model.Eleve;
import model.Formateur;
import model.Salle;
import model.Secu;


public class Test {

	public static void main(String[] args) {
		
		/*
		Eleve e = new Eleve();
		//e.setId(1);
		e.setNom("ABID");
		e.setPrenom("Jordan");
		
		Eleve e2 = new Eleve();
		//e2.setId(1);
		e2.setNom("AB");
		e2.setPrenom("CD");
		
		
		Formateur f = new Formateur();
		//f.setId(1);
		f.setNom("ABID");
		f.setPrenom("Jordan");
		
		Salle salle = new Salle();
		//salle.setId(1);
		salle.setLibelle("Florette");
		
		Secu secu = new Secu();
		//secu.setId(1);
		secu.setNumero("123456789101112131415");
		
		Eleve e3 = new Eleve();
		
		e3.setNom("MELLOUL");
		e3.setPrenom("Jacky");*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation-jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Query req = em.createQuery("FROM Eleve");
		List<Eleve> lst = req.getResultList();
		
		for(Eleve e : lst)
			System.out.println(e);
		
		/*em.merge(e3);
		
		Eleve eR = em.find(Eleve.class, 1);
		
		em.persist(e);
		em.persist(e2);
		em.persist(f);
		em.persist(salle);
		em.persist(secu);*/
		
		//f.setNom("MELLOUL");
		
		tx.commit();

		em.close();
		emf.close();
		
		
		//System.out.println(eR);
	}

}
