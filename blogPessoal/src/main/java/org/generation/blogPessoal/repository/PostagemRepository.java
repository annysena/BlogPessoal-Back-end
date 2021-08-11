package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * /@Repository: Annotation (Anotação), que indica que a Classe é uma Repository,
 * ou seja, é responsável pela comunicação com o Banco de dados através dos métodos
 * padrão e das Method Queries, que são consultas personalizadas através de palavras
 * chave que representam as instruções da linguagem SQL
 */

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	//Esta method Query é equivalente a: select * from tb_postagem where titulo like "%titulo%";
	public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	
}
