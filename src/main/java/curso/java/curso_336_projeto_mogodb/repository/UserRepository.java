package curso.java.curso_336_projeto_mogodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import curso.java.curso_336_projeto_mogodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}