package br.com.mundodoslivros.livraria.livro.application.api;

import br.com.mundodoslivros.livraria.livro.application.service.LivroService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequiredArgsConstructor
@RestController
public class LivroRestController implements LivroAPI {
    private final LivroService livroService;

    @Override
    public LivroResponse postCadastraNovoLivro(Long codEditora, LivroRequest livroRequest) {
        log.info("[inicia] LivroRestController - postCadastraNovoLivro");
        log.info("[codEditora] " + codEditora);
        LivroResponse livro = livroService.cadastraNovoLivro(codEditora, livroRequest);
        log.info("[finaliza] LivroRestController - postCadastraNovoLivro");
        return livro;
    }
}
