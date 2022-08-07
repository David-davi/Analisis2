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

import com.app.analisis2.entity.Chat;
import com.app.analisis2.repository.ChatRepository;

@RestController
@RequestMapping("/chat")
@CrossOrigin
public class ChatService {

	@Autowired
	ChatRepository chatRepository;
	
	@GetMapping(path = "/buscar")
	public List<Chat> getAllChat(){
		return chatRepository.findAll(); 
	}
	
	@PostMapping(path = "/guardar")
	public Chat saveChat(@RequestBody Chat chat) {
		return chatRepository.save(chat);
	}
	
	@DeleteMapping(path = "/eliminar/{idchat}")
	public void deleteChat(@PathVariable ("idchat") Integer idchat) {
		
		Optional<Chat> chat;
		
		chat = chatRepository.findById(idchat);
		
		if(chat.isPresent()) {
			chatRepository.delete(chat.get());
		}
		
	}
	
}


