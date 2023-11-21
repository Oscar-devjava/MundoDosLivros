package br.com.mundodoslivros.livraria.Editora.application.api;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class EditoraIdResponse {
    private Long codEditora;
}
