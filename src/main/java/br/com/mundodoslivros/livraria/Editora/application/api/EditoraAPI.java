package br.com.mundodoslivros.livraria.Editora.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/v1/editora")
public interface EditoraAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    EditoraIdResponse postRegitraNovaEditora(@RequestBody @Valid EditoraRequest editoraRequest);

    @GetMapping("{codEditora}")
    @ResponseStatus(code = HttpStatus.OK)
    EditoraDetalhadaResponse getDetalhesEditora(@PathVariable Long codEditora);

    @GetMapping("FIND_ALL")
    @ResponseStatus(code = HttpStatus.OK)
    List<EditoraListResponse> getListaTodasEditoras();


}
