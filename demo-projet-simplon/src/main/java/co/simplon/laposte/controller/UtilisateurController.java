package co.simplon.laposte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.laposte.model.Utilisateur;
import co.simplon.laposte.service.UtilisateurService;

@RestController
@RequestMapping
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService service;
	
	@GetMapping(value="/listeUtilisateur")
	public ResponseEntity<?> findAll() {
		Iterable<Utilisateur> resultat;
		resultat = service.findAll();
		return ResponseEntity.ok(resultat);
	}
	
	@GetMapping(value="listeUtilisateur/{id}")
	public ResponseEntity<?> findbyId(@PathVariable long id) {
		try {
			return ResponseEntity.ok(service.findById(id));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@PostMapping(value="/creerUtilisateur")	
	public ResponseEntity<?> save(@RequestBody Utilisateur utilisateur) {			
		Utilisateur resultat;
		resultat = service.save(utilisateur);
		return ResponseEntity.ok(resultat);
	}
}
