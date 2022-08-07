package com.app.analisis2.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.analisis2.entity.Chat;

@Repository("chatRepository")
public interface ChatRepository extends JpaRepository<Chat, Serializable>{

	public List<Chat> findByDescripcionAndPersonaIdpersona(String descricion, String personaIdpersona);
	
}
