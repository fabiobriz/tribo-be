package br.com.squad.pindorama.domain.pindorama.service;

import br.com.squad.pindorama.domain.pindorama.model.Aldeia;
import java.util.List;
import java.util.Optional;

public interface AldeiaService {

  List<Aldeia> findAll();

  Optional<Aldeia> find(String id);

  Aldeia create(Aldeia aldeia);

  Optional<Aldeia> update(String id, Aldeia aldeia);

  void delete(String id);



}
