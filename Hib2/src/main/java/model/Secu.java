package model;

import javax.persistence.*;

@Entity
@Table(name="secu")
public class Secu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="number")
	private String numero;
	
	public Secu()
	{
		
	}
	
	public Secu(int id, String numero) {
		this.id = id;
		this.numero = numero;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	

}
