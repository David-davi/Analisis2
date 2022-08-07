package com.app.analisis2.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="contacto")

public class Contacto implements Serializable {

	private static final long serialVersionUID = 3L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idcontacto")
	private Integer idcontacto;
	
	@Column(name = "nombre")
	private String nombre;
	
	public Integer getIdcontacto() {
		return idcontacto;
	}

	public void setIdcontacto(Integer idcontacto) {
		this.idcontacto = idcontacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPersonaIdpersona() {
		return personaIdpersona;
	}

	public void setPersonaIdpersona(String personaIdpersona) {
		this.personaIdpersona = personaIdpersona;
	}

	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "codigo")
	private String codigo;

	@Column(name = "persona_idpersona")
	private String personaIdpersona;
	
}
