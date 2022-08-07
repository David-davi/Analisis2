package com.app.analisis2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.analisis2.entity.Persona;
import com.app.analisis2.repository.PersonaRepository;


@RestController
@RequestMapping("/persona")
@CrossOrigin

public class PersonaServices {

	@Autowired
	PersonaRepository personaRepository;
	
	@GetMapping(path = "/buscar")
	public List<Persona> getAllChat(){
		return personaRepository.findAll(); 
	}
	
	@PostMapping(path = "/guardar")
	public Persona savePersona(@RequestBody Persona persona) {
		return personaRepository.save(persona);
	}
	
	@DeleteMapping(path = "/eliminar/{idpersona}")
	public void deletePersona(@PathVariable ("idpersona") Integer idpersona) {
		
		Optional<Persona> persona;
		persona = personaRepository.findById(idpersona);
		if(persona.isPresent()) {
			personaRepository.delete(persona.get());
		}
		
	}
	

}
