package br.com.mundodoslivros.livraria.Editora.domain;

import br.com.mundodoslivros.livraria.Editora.application.api.EditoraRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Editora {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codEditora;
    @NotBlank
    @Column(unique = true)
    public String nome;
    @NotBlank
    @Column(unique = true)
    private String telefone;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    public Editora(EditoraRequest editoraRequest) {
        this.nome = editoraRequest.getNome();
        this.telefone = editoraRequest.getTelefone();
        this.email = editoraRequest.getEmail();
    }
}
