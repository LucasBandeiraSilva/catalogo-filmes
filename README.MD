# Catálogo de Filmes - V1

Este projeto é um catálogo de filmes simples desenvolvido com Spring Boot, permitindo a criação, leitura, atualização e exclusão de filmes. A versão 1 foca em fornecer um CRUD básico para os filmes, implementando HATEOAS para uma experiência de API mais intuitiva.

## Funcionalidades

* **Criar Filme:** Permitir a criação de novos filmes com informações como título, gênero, ano de lançamento, sinopse e diretor.
* **Ler Filme:** Consultar informações detalhadas de um filme específico através de seu ID.
* **Listar Filmes:** Buscar todos os filmes disponíveis no catálogo.
* **Atualizar Filme:** Modificar as informações de um filme existente.
* **Excluir Filme:** Remover um filme do catálogo.
* **HATEOAS:** Implementar links para navegação entre os recursos da API, facilitando a descoberta e o acesso a outras informações relevantes.

## Dependências

* **Spring Web:** Framework web para desenvolvimento RESTful.
* **HATEOAS:** Suporte para criação de APIs com HATEOAS.
* **H2 Database:** Banco de dados em memória para testes.
* **DevTools:** Ferramentas para desenvolvimento, como recarregamento automático do servidor.
* **Lombok:** Biblioteca para reduzir a verbosidade do código com anotações.
* **Data JPA:** Framework para acesso a dados com JPA.

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 11 ou superior.
* **Apache Maven:** Ferramenta de gerenciamento de dependências do Java.
* **IDE:** IntelliJ IDEA, Eclipse ou outra IDE de sua preferência.

## Próximos Passos

* **Segurança (V2):** Implementar autenticação e autorização com Spring Security para proteger o acesso aos recursos.
* **Tratamento de Exceções Personalizadas (V2):** Implementar exceções personalizadas para lidar com erros específicos da aplicação e fornecer respostas mais informativas para o cliente.

## Como Executar

1. Clone o repositório em sua máquina local.
2. Execute o comando `mvn clean install` para baixar as dependências e construir o projeto.
3. Execute o comando `mvn spring-boot:run` para iniciar o servidor Spring Boot.
4. Acesse a API através de um cliente REST como Postman ou curl.

## Documentação da API

* **Listar Filmes:**
    * **Método:** GET
    * **URL:** `/filmes`
    * **Resposta:** Lista de filmes com links HATEOAS para cada filme.
* **Obter Detalhes do Filme:**
    * **Método:** GET
    * **URL:** `/filmes/{id}`
    * **Parâmetros:**
        * `id`: ID do filme.
    * **Resposta:** Detalhes do filme com links HATEOAS para a lista de filmes.
* **Criar Filme:**
    * **Método:** POST
    * **URL:** `/filmes`
    * **Requisição:** JSON com informações do filme.
    * **Resposta:** Filme criado com links HATEOAS.
* **Atualizar Filme:**
    * **Método:** PUT
    * **URL:** `/filmes/{id}`
    * **Parâmetros:**
        * `id`: ID do filme.
    * **Requisição:** JSON com as informações atualizadas do filme.
    * **Resposta:** Filme atualizado com links HATEOAS.
* **Excluir Filme:**
    * **Método:** DELETE
    * **URL:** `/filmes/{id}`
    * **Parâmetros:**
        * `id`: ID do filme.
    * **Resposta:** Status code 204 (No Content) se o filme foi excluído com sucesso.

## Contribuições

Contribuições são bem-vindas! Se você deseja melhorar ou adicionar novas funcionalidades ao catálogo de filmes, sinta-se à vontade para fazer um fork do repositório e enviar um pull request.

## Autor

Este projeto foi desenvolvido por [Lucas Bandeira da Silva](https://github.com/LucasBandeiraSilva).
