package br.com.mundodoslivros.livraria.livro.application.service;

import br.com.mundodoslivros.livraria.livro.application.api.LivroRequest;
import br.com.mundodoslivros.livraria.livro.application.api.LivroResponse;

public interface LivroService {
    LivroResponse cadastraNovoLivro(Long codEditora, LivroRequest livroRequest);
}
