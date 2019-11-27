package com.univer.entidad;

import javax.persistence.*;

@Entity
@Table(name="facultadess")
public class Facultad {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamef() {
		return namef;
	}
	public void setNamef(String namef) {
		this.namef = namef;
	}
	@Column
	private String namef;

}
