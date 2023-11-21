package br.com.mundodoslivros.livraria.livro.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/livros")
public interface LivroAPI {

    @PostMapping("/editora/{codEditora}/cadastro")
    @ResponseStatus(code = HttpStatus.CREATED)
    LivroResponse postCadastraNovoLivro(@PathVariable Long codEditora,
                                        @RequestBody @Valid LivroRequest livroRequest);
}
