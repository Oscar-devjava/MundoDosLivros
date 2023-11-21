package br.com.mundodoslivros.livraria.Editora.application.api;

import br.com.mundodoslivros.livraria.Editora.domain.Editora;
import lombok.Getter;

@Getter
public class EditoraDetalhadaResponse {

    private Long codEditora;
    public String nome;
    private String telefone;
    private String email;

    public EditoraDetalhadaResponse(Editora editora) {
        this.codEditora = editora.getCodEditora();
        this.nome = editora.nome;
        this.telefone = editora.getTelefone();
        this.email = editora.getEmail();
    }


}
