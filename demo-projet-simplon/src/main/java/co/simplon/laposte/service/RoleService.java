package co.simplon.laposte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.laposte.dao.RoleDAO;
import co.simplon.laposte.model.Role;

@Service
public class RoleService {
	
	@Autowired 
	private RoleDAO dao;
	
	public Iterable<Role> findAll() {
		return dao.findAll();
	}
	
	public Role findById(long id) {
		return dao.findById(id);
	}
	
	public Role save(Role role) {
		return dao.save(role);
	}

}
