package co.simplon.laposte.dao;

import org.springframework.data.repository.CrudRepository;

import co.simplon.laposte.model.Utilisateur;


public interface UtilisateurDAO extends CrudRepository<Utilisateur, Long>{

	public Utilisateur findById(long id);
}
