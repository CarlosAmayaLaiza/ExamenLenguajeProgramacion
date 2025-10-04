package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="subject")
public class Sujeto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdSubject")
	private int IdSubject;
	
	@Column(name="subject")
	private String nombre;
	
	@Column(name="credits")
	private String creditos;
	
	//Constructor vacio
	public Sujeto() {
		super();
	}

	//Getters and Setters
	public int getIdSubject() {
		return IdSubject;
	}

	public void setIdSubject(int idSubject) {
		IdSubject = idSubject;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCreditos() {
		return creditos;
	}

	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}

}
