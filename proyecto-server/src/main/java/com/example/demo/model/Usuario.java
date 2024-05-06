package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuario")
@EntityListeners(AuditingEntityListener.class)
public class Usuario {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	private String username;
	private String correo;
	private String password;
	private int confirmacion_correo;
	public Usuario() {}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getConfirmacion_correo() {
		return confirmacion_correo;
	}
	public void setConfirmacion_correo(int confirmacion_correo) {
		this.confirmacion_correo = confirmacion_correo;
	}
	
	
	
}
