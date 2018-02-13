package model;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Eleve {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String nom;
	
	@Column(name="firstName")
	private String prenom;
	
	@OneToOne
	private Secu secu;
	
	public Eleve(){}

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

	@Override
	public String toString() {
		return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
}
