package com.user.entidad;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7582302321037548738L;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="apellido")
	private String apellido;
	@Column(name="cedula")
	private int cedula;
	@Column(name="ingenieria")
	private String ingenieria;
	@Column(name="codigo")
	private int codigo;
	@Column (name="password")
	private String password;
	@Column(name="rol")
	private int rol;
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getIngenieria() {
		return ingenieria;
	}
	public void setIngenieria(String ingenieria) {
		this.ingenieria = ingenieria;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
