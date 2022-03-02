package br.com.squad.pindorama.domain.pindorama.repository;

import br.com.squad.pindorama.domain.pindorama.model.Aldeia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AldeiaRepository extends MongoRepository<Aldeia, String> {

}
