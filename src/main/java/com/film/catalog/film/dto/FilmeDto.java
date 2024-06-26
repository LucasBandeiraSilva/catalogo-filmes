package com.film.catalog.film.dto;

public record FilmeDto(String titulo, String genero, String diretor, String ator, String sinopse, String dataLancamento,
        String dataCadastro, String dataAtualizacao, Boolean status, String imagem) {

}
