package br.com.mundodoslivros.livraria.Editora.application.service;

import br.com.mundodoslivros.livraria.Editora.application.api.EditoraDetalhadaResponse;
import br.com.mundodoslivros.livraria.Editora.application.api.EditoraIdResponse;
import br.com.mundodoslivros.livraria.Editora.application.api.EditoraListResponse;
import br.com.mundodoslivros.livraria.Editora.application.api.EditoraRequest;

import java.util.List;

public interface EditoraService {
    EditoraIdResponse regitraNovaEditora(EditoraRequest editoraRequest);
    EditoraDetalhadaResponse detalhesEditora(Long codEditora);
    List<EditoraListResponse> listaTodasEditoras();
}
