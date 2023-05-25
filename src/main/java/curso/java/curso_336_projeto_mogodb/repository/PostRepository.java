package curso.java.curso_336_projeto_mogodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import curso.java.curso_336_projeto_mogodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}