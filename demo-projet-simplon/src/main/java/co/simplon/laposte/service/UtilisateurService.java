package co.simplon.laposte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.laposte.dao.UtilisateurDAO;
import co.simplon.laposte.model.Utilisateur;

@Service
public class UtilisateurService {

	@Autowired
	private UtilisateurDAO dao;
	
	public Iterable<Utilisateur> findAll() {
		return dao.findAll();
	}
	
	public Utilisateur findById(long id) {
		return dao.findById(id);
	}
	
	public Utilisateur save(Utilisateur utilisateur) {
		return dao.save(utilisateur);
	}
	
	
}
