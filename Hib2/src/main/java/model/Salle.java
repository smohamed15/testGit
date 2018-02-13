package model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="room")
public class Salle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="label")
	private String libelle;
	
	@OneToMany
	private List<Eleve> eleves;
	
	@OneToOne
	private Formateur f;
	
	
	public int getId() {
		return id;
	}
	
	public Salle()
	{
		
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

}
