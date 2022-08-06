package com.app.analisis2.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.analisis2.entity.Contacto;


@Repository("contactoRepository")
public interface ContactoRepository extends JpaRepository<Contacto, Serializable>{

	public List<Contacto> findByNombreAndApellido(String nombre, String apellido);
	
}
