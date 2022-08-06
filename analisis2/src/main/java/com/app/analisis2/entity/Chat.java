package com.app.analisis2.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name ="chat")

public class Chat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idchat")
	private Integer idchat;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Lob
	@Column(name = "otros")
	private String otros;
	
	@Column(name = "persona_idpersona")
	private String personaIdpersona;

	public Integer getIdchat() {
		return idchat;
	}

	public void setIdchat(Integer idchat) {
		this.idchat = idchat;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getOtros() {
		return otros;
	}

	public void setOtros(String otros) {
		this.otros = otros;
	}

	public String getPersonaIdpersona() {
		return personaIdpersona;
	}

	public void setPersonaIdpersona(String personaIdpersona) {
		this.personaIdpersona = personaIdpersona;
	}

	
}
