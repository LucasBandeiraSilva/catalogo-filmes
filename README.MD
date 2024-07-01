# Catálogo de Filmes - V2

Este projeto é um catálogo de filmes simples desenvolvido com Spring Boot, permitindo a criação, leitura, atualização e exclusão de filmes. A versão 2 foca em aprimorar a versão 1, implementando tratamento de exceções personalizadas e segurança com Spring Security para proteger o acesso aos recursos. 

## Funcionalidades

* **Criar Filme:** Permitir a criação de novos filmes com informações como título, gênero, ano de lançamento, sinopse e diretor.
* **Ler Filme:** Consultar informações detalhadas de um filme específico através de seu ID.
* **Listar Filmes:** Buscar todos os filmes disponíveis no catálogo.
* **Atualizar Filme:** Modificar as informações de um filme existente.
* **Excluir Filme:** Remover um filme do catálogo.
* **HATEOAS:** Implementar links para navegação entre os recursos da API, facilitando a descoberta e o acesso a outras informações relevantes.
* **Tratamento de Exceções Personalizadas:** Implementar exceções personalizadas para lidar com erros específicos da aplicação e fornecer respostas mais informativas para o cliente.

## Dependências

* **Spring Web:** Framework web para desenvolvimento RESTful.
* **HATEOAS:** Suporte para criação de APIs com HATEOAS.
* **H2 Database:** Banco de dados em memória para testes.
* **DevTools:** Ferramentas para desenvolvimento, como recarregamento automático do servidor.
* **Lombok:** Biblioteca para reduzir a verbosidade do código com anotações.
* **Data JPA:** Framework para acesso a dados com JPA.
* **Spring Security:** Framework para implementar segurança em aplicações Spring.

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 11 ou superior.
* **Apache Maven:** Ferramenta de gerenciamento de dependências do Java.
* **IDE:** IntelliJ IDEA, Eclipse ou outra IDE de sua preferência.

## Próximos Passos

* **Segurança (Spring Security):** Implementar autenticação e autorização com Spring Security para proteger o acesso aos recursos.
* **Documentação da API (Swagger):** Integrar Swagger para gerar documentação automática da API com exemplos de requisições e respostas.

## Como Executar

1. Clone o repositório em sua máquina local.
2. Execute o comando `mvn clean install` para baixar as dependências e construir o projeto.
3. Execute o comando `mvn spring-boot:run` para iniciar o servidor Spring Boot.
4. Acesse a API através de um cliente REST como Postman ou curl.

## Documentação da API

### Endpoints

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

### Tratamento de Exceções Personalizadas

A versão 2 implementa tratamento de exceções personalizadas para fornecer respostas mais informativas ao cliente. As exceções personalizadas são definidas em um pacote separado e mapeadas para códigos de status HTTP apropriados.

**Exceções:**

* `MovieNotFoundException`: Lançada quando um filme não é encontrado.
* `MovieListEmptyException`: Lançada quando a lista de filmes está vazia.
* `MovieNotCreatedException`: Lançada quando ocorre um erro na criação de um novo filme.
* `MovieNotUpadatedException`: Lançada quando ocorre um erro na atualização de um filme.




## Contribuições

Contribuições são bem-vindas! Se você deseja melhorar ou adicionar novas funcionalidades ao catálogo de filmes, sinta-se à vontade para fazer um fork do repositório e enviar um pull request.

## Autor

Este projeto foi desenvolvido por [Lucas Bandeira da Silva](https://github.com/LucasBandeiraSilva).

