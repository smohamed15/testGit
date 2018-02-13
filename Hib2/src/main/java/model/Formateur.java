package model;

import javax.persistence.*;

@Entity
@Table(name="teacher")
public class Formateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String nom;
	
	@Column(name="firstName")
	private String prenom;

	@OneToOne
	private Secu secu;
	
	
	public Formateur(){}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
