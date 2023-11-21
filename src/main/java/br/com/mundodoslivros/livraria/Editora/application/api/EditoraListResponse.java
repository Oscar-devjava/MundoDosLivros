package br.com.mundodoslivros.livraria.Editora.application.api;

import br.com.mundodoslivros.livraria.Editora.domain.Editora;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class EditoraListResponse {
    public String nome;
    private Long codEditora;
    private String telefone;
    private String email;


    public static List<EditoraListResponse> converte(List<Editora> editora) {
        return editora.stream().map(EditoraListResponse::new).collect(Collectors.toList());
    }

    public EditoraListResponse(Editora editora) {
        this.nome = editora.getNome();
        this.codEditora = editora.getCodEditora();
        this.telefone = editora.getTelefone();
        this.email = editora.getEmail();
    }
}
