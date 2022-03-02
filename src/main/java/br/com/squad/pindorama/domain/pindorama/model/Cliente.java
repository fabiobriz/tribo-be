package br.com.squad.pindorama.domain.pindorama.model;

import br.com.squad.pindorama.infra.auth.model.User;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

  @Id
  private String id;

  @DBRef
  private User user;

  private String nome;

  private String telefone;

  private Instant dataNascimento;

  private String cpf;

  private Endereco endereco;

  private Set<Artesanato> artesanatos = new HashSet<>();

  private Set<Pacote> pacotes = new HashSet<>();

}
