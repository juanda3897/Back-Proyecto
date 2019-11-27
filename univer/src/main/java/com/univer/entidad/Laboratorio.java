package com.univer.entidad;

import javax.persistence.*;

@Entity
@Table(name="laboratorios")
public class Laboratorio {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String namel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamel() {
		return namel;
	}
	public void setNamel(String namel) {
		this.namel = namel;
	}

}
