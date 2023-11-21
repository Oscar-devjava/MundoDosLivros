package br.com.mundodoslivros.livraria.livro.application.service;

import br.com.mundodoslivros.livraria.Editora.application.repository.EditoraRepository;
import br.com.mundodoslivros.livraria.livro.application.api.LivroRequest;
import br.com.mundodoslivros.livraria.livro.application.api.LivroResponse;
import br.com.mundodoslivros.livraria.livro.application.repository.LivroRepository;
import br.com.mundodoslivros.livraria.livro.domain.Livro;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class LivroApplicationService implements LivroService {
    private final LivroRepository repository;
    private final EditoraRepository editoraRepository;

    @Override
    public LivroResponse cadastraNovoLivro(Long codEditora, LivroRequest livroRequest) {
        log.info("[inicia]  LivroApplicationService - cadastraNovoLivro");
        log.info("[codEditora] {codEditora}" + codEditora);
        editoraRepository.buscaEditoraPorId(codEditora);
        Livro livro = repository.salvaLivro(new Livro(livroRequest,codEditora));
        log.info("[finaliza]  LivroApplicationService - cadastraNovoLivro");
        return new LivroResponse(livro.getCodLivro());
    }
}
