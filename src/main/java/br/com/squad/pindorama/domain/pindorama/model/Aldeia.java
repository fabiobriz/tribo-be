package br.com.squad.pindorama.domain.pindorama.model;

import br.com.squad.pindorama.infra.auth.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aldeia {

  @Id
  private String id;

  @Indexed(unique = true)
  @DBRef
  private User user;

  private String nome;

  private String telefone;

  private Endereco endereco;

}
