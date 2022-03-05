package br.com.squad.pindorama.domain.pindorama.repository;

import br.com.squad.pindorama.domain.pindorama.model.Cliente;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {

  Optional<Cliente> findByUserId(String userId);
}
