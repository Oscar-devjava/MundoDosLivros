package br.com.mundodoslivros.livraria.Editora.infra;

import br.com.mundodoslivros.livraria.Editora.domain.Editora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditoraSpringDataJPARepository extends JpaRepository<Editora, Long> {
}
