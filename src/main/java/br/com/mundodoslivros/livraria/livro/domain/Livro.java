package br.com.mundodoslivros.livraria.livro.domain;

import br.com.mundodoslivros.livraria.livro.application.api.LivroRequest;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name="tb_livros")
@Getter
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codLivro;
    @NotNull
    private Long codEditora;
    @NotBlank
    @Column(unique = true)
    private String titulo;
    @NotBlank
    private String autor;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @NotNull
    private LocalDate dataLancamento;
    @NotNull
    private double valor;
    private int quantidade;
    LocalDateTime dataHoraDoCadastro;

    public Livro(LivroRequest livroRequest, Long codEditora) {
        this.codEditora = codEditora;
        this.autor = livroRequest.getAutor();
        this.titulo = livroRequest.getTitulo();
        this.categoria = livroRequest.getCategoria();
        this.dataLancamento = livroRequest.getDataLancamento();
        this.valor = livroRequest.getValor();
        this.quantidade = livroRequest.getQuantidade();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}
