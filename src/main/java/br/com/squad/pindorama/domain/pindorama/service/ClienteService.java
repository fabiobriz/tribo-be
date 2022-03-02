package br.com.squad.pindorama.domain.pindorama.service;

import br.com.squad.pindorama.domain.pindorama.model.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {

  List<Cliente> findAll();

  Optional<Cliente> find(String id);

  Cliente create(Cliente Cliente);

  Optional<Cliente> update(String id, Cliente Cliente);

  void delete(String id);



}
