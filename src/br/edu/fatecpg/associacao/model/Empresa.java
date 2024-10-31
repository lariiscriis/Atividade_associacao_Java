package br.edu.fatecpg.associacao.model;

public class Empresa {
    private Cliente[] clientes = new Cliente[5];
    private Funcionario[] funcionarios = new Funcionario[10];
    private int contadorClientes = 0;
    private int contadorFuncionarios = 0;

    public void adicionarCliente(String nome, String email) {
        if (contadorClientes < clientes.length) {
            clientes[contadorClientes] = new Cliente(nome, email);
            contadorClientes++;
        } else {
            System.out.println("Não é possível cadastrar mais clientes.");
        }
    }

    public void adicionarFuncionarios(String nome, String cargo, double salario) {
        if (contadorFuncionarios < funcionarios.length) {
            funcionarios[contadorFuncionarios] = new Funcionario(nome, cargo, salario);
            contadorFuncionarios++;
        } else {
            System.out.println("Não é possível cadastrar mais funcionários.");
        }
    }

    public String exibirClientes() {
        StringBuilder listaClientes = new StringBuilder("Clientes cadastrados:\n");
        for (int i = 0; i < contadorClientes; i++) {
            listaClientes.append(clientes[i].toString()).append("\n");
        }
        return listaClientes.toString();
    }

    public String exibirFuncionarios() {
        StringBuilder listaFuncionarios = new StringBuilder("Funcionarios cadastrados:\n");
        for (int i = 0; i < contadorFuncionarios; i++) {
            listaFuncionarios.append(funcionarios[i].toString()).append("\n");
        }
        return listaFuncionarios.toString();
    }

    public double CalcularSomaSalario() {
        Calculadora calculadora = new Calculadora();
        double soma_salario = 0;
        for (int a = 0; a < funcionarios.length; a++) {
            if (funcionarios[a] != null) {
                soma_salario = calculadora.somar(soma_salario, funcionarios[a].getSalario());
            }
        }
        return soma_salario;
    }

    public double CalcularMediaSalario() {
        Calculadora calculadora = new Calculadora();
        if (contadorFuncionarios > 0) {
            double media_salarios = calculadora.dividir(CalcularSomaSalario(), contadorFuncionarios);
            return media_salarios;
        } else {
            return 0;
        }

    }
}
