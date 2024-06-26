package com.film.catalog.film.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_filmes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String genero;
    private String diretor;
    private String ator;
    private String sinopse;
    private String dataLancamento;
    private String dataCadastro;
    private String dataAtualizacao;
    private Boolean status;
    private String imagem;
}
