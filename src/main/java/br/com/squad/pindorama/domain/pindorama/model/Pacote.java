package br.com.squad.pindorama.domain.pindorama.model;

import br.com.squad.pindorama.infra.auth.model.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pacote {

  private String id;

  private String descricao;

  private Aldeia aldeia;

  private Double valor;

  private Instant dataIda;

  private Instant dataVolta;

  private Set<Imagem> imagens = new HashSet<>();

}
