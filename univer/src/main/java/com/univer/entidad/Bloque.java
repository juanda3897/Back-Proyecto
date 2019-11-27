package com.univer.entidad;

import javax.persistence.*;

@Entity
@Table(name="bloquess")
public class Bloque {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nameb;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameb() {
		return nameb;
	}
	public void setNameb(String nameb) {
		this.nameb = nameb;
	}
	
}
