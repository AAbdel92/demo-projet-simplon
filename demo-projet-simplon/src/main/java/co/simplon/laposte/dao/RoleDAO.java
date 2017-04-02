package co.simplon.laposte.dao;

import org.springframework.data.repository.CrudRepository;

import co.simplon.laposte.model.Role;

public interface RoleDAO extends CrudRepository<Role, Long> {
	
	public Role findById(long id);

}
