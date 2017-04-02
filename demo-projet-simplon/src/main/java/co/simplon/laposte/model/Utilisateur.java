package co.simplon.laposte.model;


import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
public class Utilisateur {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	
	private String pseudo;
	
	private String motDePasse;
	
	private String email;
	
	@UpdateTimestamp
	private Timestamp derniereMaj;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
	@JoinTable(name="utilisateur_role", joinColumns = {
			@JoinColumn(name = "utilisateur_id")},inverseJoinColumns = {@JoinColumn(name ="role_id")
			})
	private List<Role> roles;	
	
	protected Utilisateur() {
		
	}
	
	public Utilisateur(String identifiant, String motDePasse, String email) {
		super();
		this.pseudo = identifiant;
		this.motDePasse = motDePasse;
		this.email = email;		
	}	

//	public Utilisateur(String identifiant, String motDePasse, String email, String emailRh, RoleEnum role) {
//		super();
//		this.identifiant = identifiant;
//		this.motDePasse = motDePasse;
//		this.email = email;
//		this.emailRh = emailRh;
//		this.role = role;
//	}	
}
