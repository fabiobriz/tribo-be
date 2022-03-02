package br.com.squad.pindorama.domain.pindorama.model;


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
public class Artesanato {

  private String id;

  private String nome;

  private String descricao;

  private Double valor;

  private Set<Imagem> imagens = new HashSet<>();
}
