package br.edu.fatecpg.associacao.model;

public class Calculadora {
    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

	 public double subtrair(double numero1, double numero2) {
	        return numero1 - numero2;
    }
	 
    public double dividir(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Digite um número diferente de 0");
            return 0;
        }
    }
    
	 public double multiplicar(double numero1, double numero2) {
	        return numero1 * numero2;
	 }
}
