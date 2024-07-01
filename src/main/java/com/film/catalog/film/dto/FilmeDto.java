package com.film.catalog.film.dto;

import jakarta.validation.constraints.NotBlank;

public record FilmeDto(@NotBlank(message = "O titulo não deve ser nulo") String titulo,
        @NotBlank(message = "Você deve definir o genero do filme") String genero,
        @NotBlank(message = "Você deve informar o diretor do filme") String diretor,
        @NotBlank(message = "Você precisa inormar o ator/atores do filme") String ator, String sinopse, String dataLancamento,
        String dataCadastro, String dataAtualizacao, Boolean status, String imagem) {

}
