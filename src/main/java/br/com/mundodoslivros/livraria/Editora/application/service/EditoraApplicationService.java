package br.com.mundodoslivros.livraria.Editora.application.service;

import br.com.mundodoslivros.livraria.Editora.application.api.EditoraDetalhadaResponse;
import br.com.mundodoslivros.livraria.Editora.application.api.EditoraIdResponse;
import br.com.mundodoslivros.livraria.Editora.application.api.EditoraListResponse;
import br.com.mundodoslivros.livraria.Editora.application.api.EditoraRequest;
import br.com.mundodoslivros.livraria.Editora.application.repository.EditoraRepository;
import br.com.mundodoslivros.livraria.Editora.domain.Editora;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class EditoraApplicationService implements EditoraService {
    private final EditoraRepository editoraRepository;


    @Override
    public EditoraIdResponse regitraNovaEditora(EditoraRequest editoraRequest) {
        log.info("[inicia] EditoraApplicationService  - regitraNovaEditora ");
        Editora editora = editoraRepository.salva(new Editora(editoraRequest));
        log.info("[finaliza] EditoraApplicationService  - regitraNovaEditora ");
        return EditoraIdResponse.builder().codEditora(editora.getCodEditora()).build();
    }

    @Override
    public EditoraDetalhadaResponse detalhesEditora(Long codEditora) {
        log.info("[inicia] EditoraApplicationService  - detalhesEditora ");
        Editora editora = editoraRepository.buscaEditoraPorId(codEditora);
        log.info("[finaliza] EditoraApplicationService  - detalhesEditora ");
        return new EditoraDetalhadaResponse(editora);
    }

    @Override
    public List<EditoraListResponse> listaTodasEditoras() {
        log.info("[finaliza] EditoraApplicationService  - listaTodasEditoras ");
        List<Editora> editora = editoraRepository.buscaTodasEditoras();
        log.info("[inicia] EditoraApplicationService  - listaTodasEditoras ");
        return EditoraListResponse.converte(editora);
    }
}
