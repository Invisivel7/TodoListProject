# TODO LIST
______________________________________________________________________________________________________________________

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https:youtube) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

## O projecto está alocado [nesse git](https:https://github.com/Invisivel7/TodoListProject) para mais informações siga as instruções abaixo.

# Tecnologias
- Spring Boot
- Spring MVC
- Spring Data JPA
- SpringDoc OpenAPI 3
- MYSQL

# Práticas adotadas
- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injecção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

# Como Executar
- Clonar repositório git
- Construir o projecto:
```
    $./mvnw clean package
```
- Executar a Aplicação:
```
    $ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http:localhost:8080). O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http:localhost:8080/swagger-ui.html)

# API Endpoints

Para fazer as requisiçoes HTTP abaixo, foi utilizada a ferramenta [Postman](https://www.postman.com):

- Criar tarefa
```
http POST :8080/todos nome="Todo 1 up" descricao="Desc Todo 1 up" prioridade=2

[
    {
        "descricao": "Desc Todo 1 up",
        "id": 1,
        "nome": "Todo 1 up",
        "prioridade": 2,
        "realizado": false
    }
]

```
- Listar as tarefas
```
GET :8080/todos

[
    {
        "descricao": "Desc Todo 1 up",
        "id": 1,
        "nome": "Todo 1 up",
        "prioridade": 2,
        "realizado": false
    }
]
```

- Actualizar Tarefa

```
$ http PUT :8080/todos/1 nome="Todo 1 up" descricao="Desc Todo 1 up" prioridade=2

[
    {
        "descricao": "Desc Todo 1 up",
        "id": 1,
        "nome": "Todo 1 up",
        "prioridade": 2,
        "realizado": false
    }
]

```

- Remover Tarefa
```
http DELETE :8080/todos/1

[]

```