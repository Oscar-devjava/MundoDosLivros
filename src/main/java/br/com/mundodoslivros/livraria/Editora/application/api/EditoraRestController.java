package br.com.mundodoslivros.livraria.Editora.application.api;

import br.com.mundodoslivros.livraria.Editora.application.service.EditoraService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class EditoraRestController implements  EditoraAPI {
    private final EditoraService editoraService;


    @Override
    public EditoraIdResponse postRegitraNovaEditora(EditoraRequest editoraRequest) {
        log.info("[inicia] EditoraRestController - postRegitraNovaEditora ");
        EditoraIdResponse editora = editoraService.regitraNovaEditora(editoraRequest);
        log.info("[finaliza] EditoraRestController - postRegitraNovaEditora ");
        return editora;

    }

    @Override
    public EditoraDetalhadaResponse getDetalhesEditora(Long codEditora) {
        log.info("[inicia] EditoraRestController - getDetalhesEditora ");
        EditoraDetalhadaResponse detalhes = editoraService.detalhesEditora(codEditora);
        log.info("[finaliza] EditoraRestController - getDetalhesEditora ");
        return detalhes;
    }

    @Override
    public List<EditoraListResponse> getListaTodasEditoras() {
        log.info("[inicia] EditoraRestController - getListaTodasEditoras ");
        List<EditoraListResponse> lista = editoraService.listaTodasEditoras();
        log.info("[finaliza] EditoraRestController - getListaTodasEditoras ");
        return lista;
    }
}
