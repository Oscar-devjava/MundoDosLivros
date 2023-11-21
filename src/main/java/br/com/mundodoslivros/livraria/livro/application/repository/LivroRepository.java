package br.com.mundodoslivros.livraria.livro.application.repository;

import br.com.mundodoslivros.livraria.livro.domain.Livro;

public interface LivroRepository {

    Livro salvaLivro(Livro livro);
}
