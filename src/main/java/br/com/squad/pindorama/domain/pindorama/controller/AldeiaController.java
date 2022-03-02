package br.com.squad.pindorama.domain.pindorama.controller;

import br.com.squad.pindorama.domain.pindorama.model.Aldeia;
import br.com.squad.pindorama.domain.pindorama.service.AldeiaService;
import br.com.squad.pindorama.domain.pindorama.service.impl.AldeiaServiceImpl;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/aldeias")
public class AldeiaController {

  @Autowired
  private AldeiaService aldeiaService;

  @GetMapping
  public List<Aldeia> findAll(){
    return aldeiaService.findAll();
  }

  @GetMapping("/{id}")
  public Aldeia findById(@PathVariable String id){
    return aldeiaService.find(id).orElseThrow(RuntimeException::new);
  }

  @PostMapping
  public ResponseEntity create (@RequestBody Aldeia aldeia) throws URISyntaxException {
    Aldeia aldeiaCriada = aldeiaService.create(aldeia);
    return ResponseEntity.created(new URI("aldeias/" + aldeiaCriada.getId())).body(aldeiaCriada);
  }

  @PutMapping("/{id}")
  public ResponseEntity update(@PathVariable String id, @RequestBody Aldeia aldeia){
    return ResponseEntity.ok(aldeiaService.update(id, aldeia));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable String id){
    aldeiaService.delete(id);
    return ResponseEntity.ok().build();
  }

}
