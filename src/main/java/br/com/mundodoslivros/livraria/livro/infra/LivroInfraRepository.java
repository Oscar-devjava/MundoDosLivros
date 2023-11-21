package br.com.mundodoslivros.livraria.livro.infra;

import br.com.mundodoslivros.livraria.livro.application.repository.LivroRepository;
import br.com.mundodoslivros.livraria.livro.domain.Livro;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class LivroInfraRepository implements LivroRepository {
    private final LivroSpringDataJpaRepository jpaRepositoryLivros;


    @Override
    public Livro salvaLivro(Livro livro) {
        log.info("[inicia]  LivroInfraRepository - salvaLivro");
        var livroSalvo = jpaRepositoryLivros.save(livro);
        log.info("[finaliza]  LivroInfraRepository - salvaLivro");
        return livroSalvo;
    }
}
