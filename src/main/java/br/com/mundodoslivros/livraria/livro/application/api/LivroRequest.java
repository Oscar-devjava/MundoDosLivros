package br.com.mundodoslivros.livraria.livro.application.api;

import br.com.mundodoslivros.livraria.livro.domain.Categoria;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
public class LivroRequest {
    @NotBlank
    private String titulo;
    @NotBlank
    private String autor;
    @NotNull
    private Categoria categoria;
    @NotNull
    private LocalDate dataLancamento;
    @NotNull
    private double valor;
    private int quantidade;

}
