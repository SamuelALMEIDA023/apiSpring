Descrição breve do projeto:

Este projeto é uma aplicação Spring Boot que gerencia usuários, pedidos, produtos e pagamentos. Ele utiliza uma arquitetura em camadas (Resource, Service e Data Access) e um banco de dados H2 para testes. 
A aplicação permite operações CRUD (Create, Read, Update, Delete) para entidades como User, Order, Product, Category, entre outras.

🛠️ Tecnologias Utilizadas

    Linguagem: Java 23
    Framework: Spring Boot
    Banco de Dados: H2 (para ambiente de teste)
    Gerenciamento de Dependências: Maven
    Dependências Principais:
       Spring Web
       Spring Data JPA
       H2 Database
    Ferramentas: Spring Initializr, JPA, Hibernate

🏗️ Estrutura do Projeto

  O projeto segue uma arquitetura em camadas:

    Resource Layer: Contém os controladores REST (@RestController) que expõem os endpoints da API.
    Service Layer: Implementa a lógica de negócio e interage com a camada de acesso a dados.
    Data Access Layer: Contém os repositórios (JpaRepository) que gerenciam as operações de banco de dados.
    Entities: Representam as tabelas do banco de dados e são mapeadas com anotações JPA.

📦 Principais Entidades

    User: Representa um usuário do sistema.
    Order: Representa um pedido feito por um usuário.
    Product: Representa um produto disponível para compra.
    Category: Categoriza os produtos.
    OrderItem: Representa um item de um pedido (associação muitos-para-muitos entre Order e Product).
    Payment: Representa o pagamento de um pedido (associação um-para-um com Order).
