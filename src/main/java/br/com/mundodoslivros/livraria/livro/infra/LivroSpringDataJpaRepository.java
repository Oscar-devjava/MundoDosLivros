package br.com.mundodoslivros.livraria.livro.infra;

import br.com.mundodoslivros.livraria.livro.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroSpringDataJpaRepository extends JpaRepository<Livro, Long> {
}
