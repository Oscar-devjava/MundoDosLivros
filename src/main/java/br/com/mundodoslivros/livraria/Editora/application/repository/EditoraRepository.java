package br.com.mundodoslivros.livraria.Editora.application.repository;

import br.com.mundodoslivros.livraria.Editora.domain.Editora;

import java.util.List;

public interface EditoraRepository {
    Editora salva(Editora editora);
    Editora buscaEditoraPorId(Long codEditora);
    List<Editora> buscaTodasEditoras();
}
