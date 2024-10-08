package com.banco;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		banco.setNome("Banco DIO");
		
		Cliente joana = new Cliente();
		joana.setNome("Joana");
				
		// Usar Conta ou IConta:
		Conta cc = new ContaCorrente(joana);
		Conta poupanca = new ContaPoupanca(joana);
		
		cc.depositar(100);
		cc.imprimirExtrato();
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}

}
