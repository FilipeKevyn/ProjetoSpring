# Projeto Spring
O projeto consiste no desenvolvimento de um sistema de gerenciamento de pedidos para uma loja, utilizando a arquitetura Spring Boot. A solução baseia-se na criação de uma API RESTful que, por meio de protocolos HTTP, permite a realização de operações de CRUD (Create, Read, Update, Delete). O sistema foi projetado para garantir eficiência e escalabilidade, proporcionando uma interface robusta para o gerenciamento de pedidos, com endpoints que possibilitam a interação com os dados de forma segura e organizada. Além disso, o projeto segue boas práticas de desenvolvimento, como separação de camadas, injeção de dependências e tratamento adequado de erros, assegurando um serviço estável e de fácil manutenção.

## Estrutura do projeto
  - **Config**
  - **Entites**
  - **Repositories**
  - **Resources**
  - **Services**

## Ferramentas utilizadas 
  - **Java** 17
  - **Spring Boot** 3.3.4
  - **H2** - Banco de dados para testes
  - **Maven**

## Endpoints

1. **Obter usuários**:
   - `GET /users`
   - Retorna uma lista de usuários.

2. **Obter usuário por ID**:
   - `GET /users/{id}`
   - Retorna o usuário pertencente ao ID fornecido.

3. **Obter pedidos**:
   - `GET /orders`
   - Retorna uma lista de pedidos.

4. **Obter pedido por ID**:
   - `GET /orders/{id}`
   - Retorna o pedido correspondente ao ID fornecido.

5. **Obter categorias**:
   - `GET /categories`
   - Retorna uma lista de categorias.

6. **Obter categoria por ID**:
   - `GET /categories/{id}`
   - Retorna a categoria correspondente ao ID fornecido.

7. **Obter produtos**:
   - `GET /products`
   - Retorna uma lista de produtos.

8. **Obter produto por ID**:
   - `GET /products/{id}`
   - Retorna o produto correspondente ao ID fornecido.
     
9. **Criar usuário**:
   - `POST /users`
   - Cria um novo usuário com os dados fornecidos no corpo da requisição.

10. **Atualizar usuário por ID**:
    - `PUT /users/{id}`
    - Atualiza as informações do usuário correspondente ao ID fornecido.

11. **Deletar usuário por ID**:
    - `DELETE /users/{id}`
    - Remove o usuário correspondente ao ID fornecido.


## Passos para execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/FilipeKevyn/ProjetoSpring.git
   cd seu-repositorio
   ```

2. Compile o projeto:
   ```bash
   mvn clean install
   ```

3. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```
   
4. Acesse a API em: `http://localhost:8080/h2-console
