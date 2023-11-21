package br.com.mundodoslivros.livraria.livro.domain;

import br.com.mundodoslivros.livraria.livro.application.api.LivroRequest;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codLivro;
    @NotNull
    private Long codEditora;
    @NotBlank
    private String nome;
    @NotBlank
    private String autor;
    @NotBlank
    private String titulo;
    private Categoria categoria;
    @NotNull
    private LocalDate dataLancamento;
    @NotNull
    private double valor;


    public Livro(LivroRequest livroRequest, Long codEditora) {
        this.codEditora = codEditora;
        this.nome = livroRequest.getNome();
        this.autor = livroRequest.getAutor();
        this.titulo = livroRequest.getTitulo();
        this.categoria = livroRequest.getCategoria();
        this.dataLancamento = livroRequest.getDataLancamento();
        this.valor = livroRequest.getValor();
    }
}
