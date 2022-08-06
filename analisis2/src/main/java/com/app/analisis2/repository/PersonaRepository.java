package com.app.analisis2.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.analisis2.entity.Persona;

@Repository("personaRepository")
public interface PersonaRepository extends JpaRepository<Persona, Serializable>{

	public List<Persona> findByNombreAndApellido(String nombre, String apellido);
	
}
