package curso.java.curso_336_projeto_mogodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.java.curso_336_projeto_mogodb.domain.User;
import curso.java.curso_336_projeto_mogodb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}