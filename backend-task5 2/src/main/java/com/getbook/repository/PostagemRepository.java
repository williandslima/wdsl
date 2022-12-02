package com.getbook.repository;

import com.getbook.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long> {
  List<Postagem>findAllByTituloLivroContainingIgnoreCase(@Param ("titulo_livro") String titulo_livro);
}
