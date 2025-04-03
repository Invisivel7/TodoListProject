#TODO LIST
______________________________________________________________________________________________________________________

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https:youtube) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

- O projecto está alocado [nesse git]()

- Actualizar Tarefa

```
$ http PUT :8080/todos/1 nome="Todo 1 up" descricao="Desc Todo 1 up" prioridade=2

[
    {
        "descricao": "Desc Todo 1 up",
        "id": 8,
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