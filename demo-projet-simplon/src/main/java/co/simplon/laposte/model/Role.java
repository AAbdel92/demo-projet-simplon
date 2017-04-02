package co.simplon.laposte.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nom;
	
	@UpdateTimestamp
	private Timestamp derniereMaj;
	
	@ManyToMany(mappedBy = "roles")
	private List<Utilisateur> utilisateurs;	
//	
	public Role() {
		
	}

	public Role(String nom) {
		super();
		this.nom = nom;
	}	
}
