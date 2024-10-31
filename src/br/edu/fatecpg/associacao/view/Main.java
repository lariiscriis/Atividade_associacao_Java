package br.edu.fatecpg.associacao.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.edu.fatecpg.associacao.model.Empresa;

public class Main extends JFrame {
    private Empresa empresa = new Empresa();

    public Main() {
        empresa = new Empresa();
        setTitle("Cadastro de Funcionários e Clientes");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));
        Color rosaClaro = new Color(255, 182, 193);

        JButton btnAddCliente = new JButton("Cadastrar Cliente");
        JButton btnAddFuncionario = new JButton("Cadastrar Funcionário");
        JButton btnExibirCliente = new JButton("Exibir Cliente");
        JButton btnExibirFuncionarios = new JButton("Exibir Funcionários");
        JButton btnCalcularFolha = new JButton("Calcular Folha Salarial");

        btnAddCliente.setBackground(rosaClaro);
        btnAddFuncionario.setBackground(rosaClaro);
        btnExibirCliente.setBackground(rosaClaro);
        btnExibirFuncionarios.setBackground(rosaClaro);
        btnCalcularFolha.setBackground(rosaClaro);

        add(btnAddCliente);
        add(btnAddFuncionario);
        add(btnExibirCliente);
        add(btnExibirFuncionarios);
        add(btnCalcularFolha);

        btnAddCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarCliente();
            }
        });

        btnAddFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarFuncionarios();
            }
        });

        btnExibirCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String clientes = empresa.exibirClientes();
                JOptionPane.showMessageDialog(null, clientes);
            }
        });

        btnExibirFuncionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String funcionarios = empresa.exibirFuncionarios();
                JOptionPane.showMessageDialog(null, funcionarios);
            }
        });

        btnCalcularFolha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double somaSalario = empresa.CalcularSomaSalario();
                double mediaSalario = empresa.CalcularMediaSalario();
                JOptionPane.showMessageDialog(null, "Total dos Salários é: R$" + somaSalario);
                JOptionPane.showMessageDialog(null, "Total da Média Salarial é: R$" + mediaSalario);

            }
        });
    }

    public void adicionarCliente() {
        String nome = JOptionPane.showInputDialog(this, "Digite o nome do cliente:");
        String email = JOptionPane.showInputDialog(this, "Digite o email do cliente:");
        if (nome != null && email != null) {
            empresa.adicionarCliente(nome, email);
            JOptionPane.showMessageDialog(this, "Cliente adicionado com sucesso!");
        }
    }

    public void adicionarFuncionarios() {
        String nome = JOptionPane.showInputDialog(this, "Digite o nome do funcionário:");
        String cargo = JOptionPane.showInputDialog(this, "Digite o cargo do funcionario:");
        String salariostring = JOptionPane.showInputDialog(this, "Digite o salário do funcionário:");
        double salario = Double.parseDouble(salariostring);
        if (nome != null && cargo != null) {
            empresa.adicionarFuncionarios(nome, cargo, salario);
            JOptionPane.showMessageDialog(this, "Funcionário adicionado com sucesso!");
        }
    }

    public static void main(String[] args) throws Exception {
        Main gui = new Main();
        gui.setVisible(true);
    }
}
