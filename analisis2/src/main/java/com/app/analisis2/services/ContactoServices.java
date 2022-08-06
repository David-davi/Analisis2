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

import com.app.analisis2.entity.Contacto;
import com.app.analisis2.repository.ContactoRepository;


@RestController
@RequestMapping("/contacto")
@CrossOrigin


public class ContactoServices {

	@Autowired
	ContactoRepository contactoRepository;
	
	@GetMapping(path = "/buscar")
	public List<Contacto> getAllChat(){
		return contactoRepository.findAll(); 
	}
	
	@PostMapping(path = "/guardar")
	public Contacto savePersona(@RequestBody Contacto contacto) {
		return contactoRepository.save(contacto);
	}
	
	@DeleteMapping(path = "/eliminar/{idcontacto}")
	public void deleteContacto(@PathVariable ("idcontacto") Integer idcontacto) {
		
		Optional<Contacto> contacto;
		contacto = contactoRepository.findById(idcontacto);
		if(contacto.isPresent()) {
			contactoRepository.delete(contacto.get());
		}
		
	}
	
	
}
