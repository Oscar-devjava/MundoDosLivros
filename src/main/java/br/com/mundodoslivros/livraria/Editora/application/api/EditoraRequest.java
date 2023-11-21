package br.com.mundodoslivros.livraria.Editora.application.api;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class EditoraRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotBlank
    private String email;
}
