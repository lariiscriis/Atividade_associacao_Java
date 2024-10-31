# Sistema de Cadastro com Interface Gráfica (Swing)

Este projeto implementa um sistema de cadastro básico de clientes e funcionários com uma interface gráfica usando Java Swing. A aplicação foca em conceitos de **associação**, **composição** e **dependência** entre classes.

## Funcionalidades

### Parte 1: Associação

- **Classe Cliente**: Armazena os atributos `nome` e `email`.
- **Classe Empresa**: Armazena uma lista de até 5 clientes.
  - `adicionarCliente(String nome, String email)`: Adiciona um novo cliente à lista.
  - `exibirClientes()`: Exibe o nome e o email de cada cliente cadastrado.

### Parte 2: Composição

- A **Classe Empresa** armazena uma lista de até 10 funcionários.
  - `adicionarFuncionario(String nome, String cargo, double salario)`: Adiciona um novo funcionário com nome, cargo e salário.
  - `exibirFuncionarios()`: Exibe o nome e cargo de cada funcionário.

### Parte 3: Dependência

- **Classe Calculadora**: Realiza operações de soma e divisão.
- Na **Classe Empresa**:
  - `CalcularSomaSalario()`: Utiliza a `Calculadora` para calcular a soma salarial dos funcionários.
  - `CalcularMediaSalario()`:  Utiliza a `Calculadora` para calcular a média salarial dos funcionários.

## Tecnologias

- Java (Swing para interface gráfica)

## Desenvolvedores
- Larissa Cristina Bento Santana (FATEC Praia Grande)
- Arthur Lopes Santos (FATEC Praia Grande)


